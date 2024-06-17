/**
 * 
 */
package Gui;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

/**
 * @author sibekodumisani
 *
 */
public class Navigation {
	private MenuBar mbar = new MenuBar();
	private Menu fileMenu = new Menu("File");
	private Menu accountMenu = new Menu("Account");
	private Menu booksMenu = new Menu("Books");
	private Menu membersMenu = new Menu("Members");
	
	//set MenuItems
	
	private MenuItem miNew = new MenuItem("New File");
	private MenuItem miOpen = new MenuItem("Open File");
	private MenuItem miSave = new MenuItem("Save File");
	private MenuItem miLogin = new MenuItem("Log in");
	private MenuItem miLogOut = new MenuItem("Log out");
	private MenuItem miSearch = new MenuItem("Search");
	private MenuItem miAddBook = new MenuItem("Add");
	private MenuItem miRemoveBook = new MenuItem("Remove");
	private MenuItem miUpdateBook = new MenuItem("Update");
	private MenuItem miRent = new MenuItem("Rent");
			
	
	
	public Navigation() {
		mbar.getMenus().add(fileMenu);
		mbar.getMenus().add(accountMenu);
		mbar.getMenus().add(booksMenu);
		mbar.getMenus().add(membersMenu);
		
		
		fileMenu.getItems().add(miNew);
		fileMenu.getItems().add(miOpen);
		fileMenu.getItems().add(miSave);
		
		accountMenu.getItems().add(miLogin);
		accountMenu.getItems().add(miLogOut);
		
		booksMenu.getItems().add(miSearch);
		booksMenu.getItems().add(miAddBook);
		booksMenu.getItems().add(miRemoveBook);
		booksMenu.getItems().add(miUpdateBook);
		booksMenu.getItems().add(miRent);
	}
	
	public MenuBar getMenuBar() {
		return mbar;
	}

	/**
	 * @return the mbar
	 */
	public MenuBar getMbar() {
		return mbar;
	}

	/**
	 * @return the fileMenu
	 */
	public Menu getFileMenu() {
		return fileMenu;
	}

	/**
	 * @return the accountMenu
	 */
	public Menu getAccountMenu() {
		return accountMenu;
	}

	/**
	 * @return the booksMenu
	 */
	public Menu getBooksMenu() {
		return booksMenu;
	}

	/**
	 * @return the membersMenu
	 */
	public Menu getMembersMenu() {
		return membersMenu;
	}

	/**
	 * @return the miNew
	 */
	public MenuItem getMiNew() {
		return miNew;
	}

	/**
	 * @return the miOpen
	 */
	public MenuItem getMiOpen() {
		return miOpen;
	}

	/**
	 * @return the miSave
	 */
	public MenuItem getMiSave() {
		return miSave;
	}

	/**
	 * @return the miLogin
	 */
	public MenuItem getMiLogin() {
		return miLogin;
	}

	/**
	 * @return the miLogOut
	 */
	public MenuItem getMiLogOut() {
		return miLogOut;
	}

	/**
	 * @return the miSearch
	 */
	public MenuItem getMiSearch() {
		return miSearch;
	}

	/**
	 * @return the miAddBook
	 */
	public MenuItem getMiAddBook() {
		return miAddBook;
	}

	/**
	 * @return the miRemoveBook
	 */
	public MenuItem getMiRemoveBook() {
		return miRemoveBook;
	}

	/**
	 * @return the miUpdateBook
	 */
	public MenuItem getMiUpdateBook() {
		return miUpdateBook;
	}

	/**
	 * @return the miRent
	 */
	public MenuItem getMiRent() {
		return miRent;
	}
	
	
}
