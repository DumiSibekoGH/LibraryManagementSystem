
import Gui.Interface;
import Gui.Logging;
import Lib.Availability_Status;
import Lib.Book;
import Lib.Library;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * 
 */

/**
 * @author sibekodumisani
 *
 */
public class Main extends Application{
	private boolean isLoggedIn = true;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library l = new Library();
		l.refreshLibrary();

		System.out.print(l.isEmpty());
		launch();
	}
	
	@Override
	public void start(Stage primaryStage) {
		Interface gui = new Interface();
		Logging log = new Logging();
		Library lib = new Library();
		lib.refreshLibrary();
		
		
		// Search Library button
		gui.getNav().getMiSearch().setOnAction(event->{
			if(isLoggedIn == false)
				gui.replaceUI(log.getLoginUI());
			else
				gui.bookListing();
				
		});
		
		//add book
		gui.getNav().getMiAddBook().setOnAction(event->{
			gui.addBook();
			gui.getLibGUI().getSubmitButton().setOnAction(e->{
				Book newBook = new Book(gui.getLibGUI().getTitleField().getText(), 
						gui.getLibGUI().getAuthorField().getText(),
						gui.getLibGUI().getIsbnField().getText(),
						gui.getLibGUI().getPublisherField().getText(),
						gui.getLibGUI().getPublicationDateField().getText(),
						gui.getLibGUI().getPagesField().getText(),
						Availability_Status.valueOf(gui.getLibGUI().getAvailabilityField().getValue()), 
						gui.getLibGUI().getKeywordField().getText());
				
				lib.push(newBook);
			});
		});
		
		
		// LogIn button
		gui.getNav().getMiLogin().setOnAction(event->{
			Logging logging = new Logging();
	        VBox loginUI = logging.getLoginUI();

	        gui.replaceUI(loginUI);
		});
			
		// Logout button
		gui.getNav().getMiLogOut().setOnAction(event->{
			if(isLoggedIn == false)
				gui.replaceUI(log.getLoginUI());
			else
				gui.replaceUI(log.logout());
		});
		
		Scene sc = new Scene(gui.getRoot(), 400,400);
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}

}
