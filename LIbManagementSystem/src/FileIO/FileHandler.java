/**
 * 
 */
package FileIO;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/**
 * @author sibekodumisani
 *
 */
public class FileHandler {
	public static void writeToLibFile(String filename, String info) {
		
		File f = new File(filename);
		
		try {
			PrintWriter pWriter = new PrintWriter(f);
			
			pWriter.print(info + "\n");
			
			pWriter.close();
		}catch(FileNotFoundException fnfe) {
			System.out.print("File not found. Please check filepath/filename");
		}
		
		
	}
	
	public static String readFromLibFile(String filename) {
		String info = "";
		System.out.println(filename);
		String[] arrName = filename.split(".");
		
		System.out.println(arrName);
		
		String filetype = arrName[arrName.length-1];
		
		File f = new File(filename);
		
		if(filetype.compareTo("txt") == 0) {
			try {
			
			Scanner scIn = new Scanner(f);
				
			while(scIn.hasNext()) {
				info += scIn.nextLine() + "\n";
			}
				
			scIn.close();
			}catch(FileNotFoundException fnfe) {
				System.out.print("File not found. Please check filepath/filename");
			}	
		}else {
			try {
				FileInputStream fis = new FileInputStream(f);
				DataInputStream dataIn = new DataInputStream(fis);
				BufferedInputStream buffIn = new BufferedInputStream(dataIn);
				
				while(buffIn.available() > 0) {
					buffIn.read();
				}
				
				buffIn.close();
			}catch(IOException ioe) {
				
			}
		}
		
		return info;
	}
	
	public String readFromPwdFile(String filename) {
		String txtPwd = "";
		
		File f = new File(filename);
		
		try(FileInputStream fis = new FileInputStream(f);
			BufferedInputStream buffIn = new BufferedInputStream(fis);
			DataInputStream dataIn = new DataInputStream(buffIn)){
			
			int b;
			
			while((b = dataIn.read()) > 0) {
				
			}
		}catch(IOException ioe) {
			
		}
		
	
		return txtPwd;
	}
	
	
	
	// Hashing functions
	public static byte[] getSHA(String input) throws NoSuchAlgorithmException
    {
        // Static getInstance method is called with hashing SHA
        MessageDigest md = MessageDigest.getInstance("SHA-256");
 
        // digest() method called
        // to calculate message digest of an input
        // and return array of byte
        return md.digest(input.getBytes(StandardCharsets.UTF_8));
    }
     
    public static String toHexString(byte[] hash)
    {
        // Convert byte array into signum representation
        BigInteger number = new BigInteger(1, hash);
 
        // Convert message digest into hex value
        StringBuilder hexString = new StringBuilder(number.toString(16));
 
        // Pad with leading zeros
        while (hexString.length() < 64)
        {
            hexString.insert(0, '0');
        }
 
        return hexString.toString();
    }
	
}
