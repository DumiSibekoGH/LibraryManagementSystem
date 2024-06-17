/**
 * 
 */
package Lib;

import java.util.ArrayList;

import FileIO.FileHandler;

/**
 * @author sibekodumisani
 *
 */
public class Library {
	public static Book[] books = new Book[0];
	// alphanumeric sorting 
	
	
	//Use Array-based stack
	
	
	/**
	 * @param String keyword
	 * @param Book[] booksArr
	 * @param int lo
	 * @param int hi
	 * @description Searches for an instance of Book using the keyword
	 * */
	public Book search(String keyword,  Book[] booksArr, int lo, int hi) {
		//binary recursion
		lo = 0;
		hi = books.length;
		int mid = (hi+lo) / 2;
		
		if(books[mid].getKeyword().compareTo(keyword) == 0) {
			return books[mid];
		}else if(books[mid].getKeyword().compareTo(keyword) < 0) {
			
			return search(keyword, booksArr, lo, mid-1);
		}
		else if(books[mid].getKeyword().compareTo(keyword) > 0) {
			return search(keyword, booksArr, mid+1, hi);
		}
		
		return books[mid];
	}
	
	
	/**
	 * @param Book b
	 * @description Inserts a new book instance at the end of the array
	 * */
	public void push(Book b) {
		int count = 0;
		
		increaseSize();
		
		while(books[count] != null) {
			count++;
		}
		
		books[count] = b;
	}
	
	/**
	 * @description Removes a new book instance at the end of the array and returns the instance
	 * @description Returns null if the array is empty
	 * */
	public Book pop() {
		//if library is null
		if(books.length == 0) {
			return null;
		}
		
		//book instance to be popped
		Book bk = books[books.length-1];
		
		//new book array after pop
		Book[] newLib = new Book[books.length-1];
		
		//copy newLib array from books array until length-1
		for(int i = 0; i < books.length-1; i++) {
			newLib[i] = books[i];
		}
		
		books = newLib;
		
		return bk;
	}
	
	
	// not explicitly called by the user
	// executed after every push/pop method call
	public void refreshLibrary() {
		
		String s = FileHandler.readFromLibFile("./docs/booksList.txt");
		
		String[] txtBooksInfo = s.split("\n");
		
		for(String strBooks: txtBooksInfo) {
			String[] singleBookInfo = strBooks.split(";");
			
			String Title = singleBookInfo[0];
			String Author = singleBookInfo[1];
			String ISBN = singleBookInfo[2];
			String Publisher = singleBookInfo[3];
			String publicationDate = singleBookInfo[4];
			String Pages = singleBookInfo[5];
			Availability_Status Availability = null;			
			String keyword = singleBookInfo[7];
			
			String txtAvail = singleBookInfo[6];
			switch(txtAvail) {
			case "In Stock":
				Availability = Availability_Status.InStock;
			case "Out of Stock":
				Availability = Availability_Status.OutOfStock;
			}
			
			
			Book b = new Book(Title, Author, ISBN, Publisher, publicationDate, Pages, Availability, keyword);
			
			push(b);
			
		}
		
		
	}
	
	public boolean isEmpty() {
		if(books.length == 0)
			return true;
		
		return false;
	}
	
	public void increaseSize() {
		int size  = books.length + 1;
		
		Book[] newLib = new Book[size];
		int count = 0;
		
		for(Book b: books) {
			newLib[count] = b;
			count++;
		}
		
		books = newLib;
		 
	}
	
	
	//Method overloading
	public void increaseSize(int size) {
		if(size <= books.length) {
			return;
		}
		
		Book[] newLib = new Book[size];
		int count = 0;
		
		for(Book b: books) {
			newLib[count] = b;
			count++;
		}
			
	}
}
