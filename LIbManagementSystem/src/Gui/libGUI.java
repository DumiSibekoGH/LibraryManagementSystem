package Gui;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class libGUI {
	private TextField titleField;
    private TextField authorField;
    private TextField isbnField;
    private TextField publisherField;
    private TextField publicationDateField;
    private TextField pagesField;
    private ChoiceBox<String> availabilityField;
    private TextField keywordField;
    private Button submitButton = new Button("Add Book");
    
	public GridPane addBook() {
		// Create form grid pane
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setHgap(10);
        gridPane.setVgap(8);

        // Title input
        Label titleLabel = new Label("Title:");
        titleField = new TextField();
        gridPane.add(titleLabel, 0, 0);
        gridPane.add(titleField, 1, 0);

        // Author input
        Label authorLabel = new Label("Author:");
        authorField = new TextField();
        gridPane.add(authorLabel, 0, 1);
        gridPane.add(authorField, 1, 1);

        // ISBN input
        Label isbnLabel = new Label("ISBN:");
        isbnField = new TextField();
        gridPane.add(isbnLabel, 0, 2);
        gridPane.add(isbnField, 1, 2);

        // Publisher input
        Label publisherLabel = new Label("Publisher:");
        publisherField = new TextField();
        gridPane.add(publisherLabel, 0, 3);
        gridPane.add(publisherField, 1, 3);

        // Publication Date input
        Label publicationDateLabel = new Label("Publication Date:");
        publicationDateField = new TextField();
        gridPane.add(publicationDateLabel, 0, 4);
        gridPane.add(publicationDateField, 1, 4);

        // Pages input
        Label pagesLabel = new Label("Pages:");
        pagesField = new TextField();
        gridPane.add(pagesLabel, 0, 5);
        gridPane.add(pagesField, 1, 5);

        // Availability Status input
        Label availabilityLabel = new Label("Availability:");
        availabilityField = new ChoiceBox<>();
        availabilityField.getItems().addAll("Available", "Unavailable");
        availabilityField.setValue("Available"); // Default value
        gridPane.add(availabilityLabel, 0, 6);
        gridPane.add(availabilityField, 1, 6);

        // Keyword input (not editable)
        Label keywordLabel = new Label("Keyword:");
        keywordField = new TextField("Book"); // Default value
        keywordField.setEditable(false);
        gridPane.add(keywordLabel, 0, 7);
        gridPane.add(keywordField, 1, 7);

        // Submit button
        submitButton.setOnAction(e -> addBook());
        gridPane.add(submitButton, 1, 8);
        
        return gridPane;
	}

	/**
	 * @return the titleField
	 */
	public TextField getTitleField() {
		return titleField;
	}

	/**
	 * @param titleField the titleField to set
	 */
	public void setTitleField(TextField titleField) {
		this.titleField = titleField;
	}

	/**
	 * @return the authorField
	 */
	public TextField getAuthorField() {
		return authorField;
	}

	/**
	 * @param authorField the authorField to set
	 */
	public void setAuthorField(TextField authorField) {
		this.authorField = authorField;
	}

	/**
	 * @return the isbnField
	 */
	public TextField getIsbnField() {
		return isbnField;
	}

	/**
	 * @param isbnField the isbnField to set
	 */
	public void setIsbnField(TextField isbnField) {
		this.isbnField = isbnField;
	}

	/**
	 * @return the publisherField
	 */
	public TextField getPublisherField() {
		return publisherField;
	}

	/**
	 * @param publisherField the publisherField to set
	 */
	public void setPublisherField(TextField publisherField) {
		this.publisherField = publisherField;
	}

	/**
	 * @return the publicationDateField
	 */
	public TextField getPublicationDateField() {
		return publicationDateField;
	}

	/**
	 * @param publicationDateField the publicationDateField to set
	 */
	public void setPublicationDateField(TextField publicationDateField) {
		this.publicationDateField = publicationDateField;
	}

	/**
	 * @return the pagesField
	 */
	public TextField getPagesField() {
		return pagesField;
	}

	/**
	 * @param pagesField the pagesField to set
	 */
	public void setPagesField(TextField pagesField) {
		this.pagesField = pagesField;
	}

	/**
	 * @return the availabilityField
	 */
	public ChoiceBox<String> getAvailabilityField() {
		return availabilityField;
	}

	/**
	 * @param availabilityField the availabilityField to set
	 */
	public void setAvailabilityField(ChoiceBox<String> availabilityField) {
		this.availabilityField = availabilityField;
	}

	/**
	 * @return the keywordField
	 */
	public TextField getKeywordField() {
		return keywordField;
	}

	/**
	 * @param keywordField the keywordField to set
	 */
	public void setKeywordField(TextField keywordField) {
		this.keywordField = keywordField;
	}

	/**
	 * @return the submitButton
	 */
	public Button getSubmitButton() {
		return submitButton;
	}

	/**
	 * @param submitButton the submitButton to set
	 */
	public void setSubmitButton(Button submitButton) {
		this.submitButton = submitButton;
	}
	
	
	
	
}
