/**
 * 
 */
package Lib;

/**
 * @author sibekodumisani
 *
 */
public class Book {
	private String Title;
	private String Author;
	private String ISBN;
	private String Publisher;
	private String publicationDate;
	private String Pages;
	private Availability_Status Availability;
	private String keyword;
	
	public Book(String Title, String Author,String ISBN,String Publisher,String publicationDate,String Pages,Availability_Status Availability, String keyword) {
		this.Title = Title;
		this.Author = Author;
		this.ISBN = ISBN;
		this.Publisher = Publisher;
		this.publicationDate = publicationDate;
		this.Pages = Pages;
		this.Availability = Availability;
		this.keyword = keyword;
	}
	
	public String getKeyword() {
		return keyword;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return Title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return Author;
	}

	/**
	 * @return the iSBN
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return Publisher;
	}

	/**
	 * @return the publicationDate
	 */
	public String getPublicationDate() {
		return publicationDate;
	}

	/**
	 * @return the pages
	 */
	public String getPages() {
		return Pages;
	}

	/**
	 * @return the availability
	 */
	public Availability_Status getAvailability() {
		return Availability;
	}
	
	
	
	
	
}
