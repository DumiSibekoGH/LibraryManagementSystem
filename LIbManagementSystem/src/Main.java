
import Gui.Interface;
import Gui.Logging;
import Lib.Library;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 
 */

/**
 * @author sibekodumisani
 *
 */
public class Main extends Application{

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
			
			gui.bookListing();
		});
		
		
		// LogIn button
		gui.getNav().getMiLogin().setOnAction(event->{
			
			gui.addUI(log.gp);
		});
			
		// Logout button
		gui.getNav().getMiLogOut().setOnAction(event->{
			gui.addUI(log.logout());
		});
		
		Scene sc = new Scene(gui.getRoot(), 400,400);
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}

}
