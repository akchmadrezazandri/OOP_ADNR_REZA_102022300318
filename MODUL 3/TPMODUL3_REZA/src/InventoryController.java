import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventoryController {
    @FXML
    private TableView<Album> tableView;
    @FXML
    private TableColumn<Album, String> columnAlbumName;
    @FXML
    private TableColumn<Album, String> columnArtist;
    @FXML
    private TableColumn<Album, Integer> columnTotal;
    @FXML
    private TableColumn<Album, Integer> columnAvailable;
    @FXML
    private TableColumn<Album, Integer> columnRented;

    @FXML
    private TextField albumNameField;
    @FXML
    private TextField artistField;
    @FXML
    private TextField totalField;
    @FXML
    private TextField availableField;

    private ObservableList<Album> albumList;

    @FXML
    public void initialize() {
        columnAlbumName.setCellValueFactory(cellData -> cellData.getValue().albumNameProperty());
        columnArtist.setCellValueFactory(cellData -> cellData.getValue().artistProperty());
        columnTotal.setCellValueFactory(cellData -> cellData.getValue().totalProperty().asObject());
        columnAvailable.setCellValueFactory(cellData -> cellData.getValue().availableProperty().asObject());
        columnRented.setCellValueFactory(cellData -> cellData.getValue().rentedProperty().asObject());

        albumList = FXCollections.observableArrayList(
                new Album("Abbey Road", "The Beatles", 10, 8, 2),
                new Album("The Dark Side of the Moon", "Pink Floyd", 7, 5, 2)
        );
        tableView.setItems(albumList);
    }

    @FXML
    public void addAlbum() {
        try {
            String albumName = albumNameField.getText();
            String artist = artistField.getText();
            int total = Integer.parseInt(totalField.getText());
            int available = Integer.parseInt(availableField.getText());

            albumList.add(new Album(albumName, artist, total, available, total - available));
            clearFields();
        } catch (NumberFormatException e) {
            showError("Invalid input. Please enter valid data.");
        }
    }

    @FXML
    public void deleteAlbum() {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            albumList.remove(selectedAlbum);
        } else {
            showError("No album selected.");
        }
    }

    @FXML
    public void updateAlbum() {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            try {
                selectedAlbum.setAlbumName(albumNameField.getText());
                selectedAlbum.setArtist(artistField.getText());
                selectedAlbum.setTotal(Integer.parseInt(totalField.getText()));
                selectedAlbum.setAvailable(Integer.parseInt(availableField.getText()));
                tableView.refresh();
                clearFields();
            } catch (NumberFormatException e) {
                showError("Invalid input. Please enter valid data.");
            }
        } else {
            showError("No album selected.");
        }
    }

    @FXML
    public void rentAlbum() {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            if (selectedAlbum.getAvailable() > 0) {
                selectedAlbum.setAvailable(selectedAlbum.getAvailable() - 1);
                selectedAlbum.setRented(selectedAlbum.getRented() + 1);
                tableView.refresh();
            } else {
                showError("No available copies left.");
            }
        } else {
            showError("No album selected.");
        }
    }

    private void clearFields() {
        albumNameField.clear();
        artistField.clear();
        totalField.clear();
        availableField.clear();
    }

    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
