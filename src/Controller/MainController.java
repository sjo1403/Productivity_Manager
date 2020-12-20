package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private TextField projectTxt;

    @FXML
    private TextField elapsedTxt;

    @FXML
    private TextField remainTxt;

    @FXML
    private TextField searchTxt;

    @FXML
    private StackedBarChart<?, ?> chart;

    @FXML
    private TreeTableView<?> treeView;

    @FXML
    private TreeTableColumn<?, ?> projectCol;

    @FXML
    private Button closeButt;

    /**
     * returns user to welcome screen
     */
    @FXML
    void closeButt(ActionEvent event) {
        Stage stage = (Stage) closeButt.getScene().getWindow();
        stage.close();

    }

    @FXML
    void newButt(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/View/NewProject.fxml"));
        stage.setTitle("GoodCard");
        stage.setScene(new Scene(root, 600, 550));
        stage.show();

    }

    @FXML
    void optionButt(ActionEvent event) {

    }

    @FXML
    void reportButt(ActionEvent event) {

    }

    @FXML
    void deleteButt(ActionEvent event) {
        closeButt(event);

    }

    @FXML
    void trackButt(ActionEvent event) {

    }

    @FXML
    void searchTxt(ActionEvent event) {

    }

    @FXML
    void viewButt(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
