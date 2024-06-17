/**
 * 
 */
package Gui;

import Lib.Book;
import Lib.Library;
import javafx.scene.Node;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

/**
 * @author sibekodumisani
 *
 */
public class Interface {
	
	private VBox root = new VBox();
	private Navigation nav = new Navigation();
	private MenuBar mb = (nav.getMenuBar());
	
	
	public Interface() {
		root.getChildren().add(mb);
	}
	
	
	public void addUI(Object o) {
		
		root.getChildren().add((Node)o);
	}
	
	public void replaceUI(Object o) {
		root.getChildren().clear();
		root.getChildren().addAll(mb,(Node)o);
	}
	
	@SuppressWarnings("unchecked")
	public void bookListing() {
		String[] strCol = {"Title","Author","ISBN","Publisher","Publication Date","Pages"
				,"Availability"};
		
		TableView<Book> tv = new TableView<Book>();
		
		TableColumn<Book, String> titleColumn = new TableColumn<>(strCol[0]);
        TableColumn<Book, String> authorColumn = new TableColumn<>(strCol[1]);
        TableColumn<Book, String> isbnColumn = new TableColumn<>(strCol[2]);
        TableColumn<Book, String> publisherColumn = new TableColumn<>(strCol[3]);
        TableColumn<Book, String> dateColumn = new TableColumn<>(strCol[4]);
        TableColumn<Book, String> pagesColumn = new TableColumn<>(strCol[5]);
        TableColumn<Book, String> availabilityColumn = new TableColumn<>(strCol[6]);

        titleColumn.setCellValueFactory(new PropertyValueFactory<Book,String>("Title"));
        authorColumn.setCellValueFactory(new PropertyValueFactory<Book,String>("Author"));
        isbnColumn.setCellValueFactory(new PropertyValueFactory<Book,String>("ISBN"));
        publisherColumn.setCellValueFactory(new PropertyValueFactory<Book,String>("Publisher"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<Book,String>("publicationDate"));
        pagesColumn.setCellValueFactory(new PropertyValueFactory<Book,String>("Pages"));
        availabilityColumn.setCellValueFactory(new PropertyValueFactory<Book,String>("Availability"));
        
        
	        // Add columns to the TableView
	    tv.getColumns().addAll(titleColumn, authorColumn, isbnColumn,publisherColumn,dateColumn,pagesColumn,availabilityColumn);
		
		
	    for(Book b: Library.books) {
			tv.getItems().add(b);
		}
		
		tv.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		tv.setEditable(true);
		
		addUI(tv);
	}
	
	public VBox getRoot() {
		return root;
	}


	/**
	 * @return the mb
	 */
	public MenuBar getMb() {
		return mb;
	}


	/**
	 * @return the nav
	 */
	public Navigation getNav() {
		return nav;
	}
	

}
