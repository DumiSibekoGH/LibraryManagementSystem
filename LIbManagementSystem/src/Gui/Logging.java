/**
 * 
 */
package Gui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Optional;

import javax.swing.GroupLayout.Alignment;

import com.sun.tools.javac.Main;

import FileIO.FileHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

/**
 * @author sibekodumisani
 *
 */
public class Logging {
	private Label lblUsername;
	private TextField txtUsername;
	private Label lblPassword;
	private TextField txtPassword;
	public GridPane gp = new GridPane();
	Button btnLogin;
	
	public Logging() {
		lblUsername = new Label("Username: ");
		txtUsername = new TextField();
		lblPassword = new Label("Password: ");
		txtPassword = new TextField();
	}

	/**
	 * @return the txtUsername
	 */
	public TextField getTxtUsername() {
		return txtUsername;
	}

	/**
	 * @param txtUsername the txtUsername to set
	 */
	public void setTxtUsername(TextField txtUsername) {
		this.txtUsername = txtUsername;
	}

	/**
	 * @return the txtPassword
	 */
	public TextField getTxtPassword() {
		return txtPassword;
	}

	/**
	 * @param txtPassword the txtPassword to set
	 */
	public void setTxtPassword(TextField txtPassword) {
		this.txtPassword = txtPassword;
	}
	
	public void login() {
		gp.add(lblUsername, 0, 0);
		gp.add(lblPassword, 0, 1);
		gp.add(txtUsername, 1, 0);
		gp.add(txtPassword, 1, 1);
		
		btnLogin = new Button("Login");
		
		VBox vb = new VBox();
		
		vb.getChildren().addAll(gp,btnLogin);
	}
	
	
	public ImageView logout() {
		Alert a = new Alert(Alert.AlertType.CONFIRMATION);
		ImageView iv = null;
		a.setContentText("Do you really want to log out?");
		
		
		Optional<ButtonType> res = a.showAndWait();
		
		if(res.get() == ButtonType.OK) {
			
			File f = new File("./docs/Beluga.png");
			FileInputStream fis = null;
			
			try {
				fis = new FileInputStream(f);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Image img = new Image(fis);
			
			iv = new ImageView(img);
			iv.setFitHeight(400);
			iv.setFitWidth(250);
		}
		
		return iv;
	}
	
	
	public static boolean verifyCredentials() {
		String userData = FileHandler.readFromLibFile("./docs/UserData.dat");
		return false;
		
	}
}
