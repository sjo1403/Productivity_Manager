package Controller;

import Model.Data;
import Model.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
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
    private StackedBarChart<?, ?> chart;

    @FXML
    private Button closeButt;

    @FXML
    private TextField searchTxt;

    @FXML
    private TableView<Task> table;

    @FXML
    private TableColumn<Task, String> taskCol;

    @FXML
    void closeButt(ActionEvent event) {
        Stage stage = (Stage) closeButt.getScene().getWindow();
        stage.close();
    }

    @FXML
    void newButt(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/View/NewTask.fxml"));
        stage.setTitle("GoodCard");
        stage.setScene(new Scene(root, 400, 350));
        stage.show();
    }

    @FXML
    void modifyButt(ActionEvent event) throws IOException {
        int selectedRow = table.getSelectionModel().getSelectedIndex();
        Task selectedTask = (Task) table.getSelectionModel().getSelectedItem();

        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/View/ModifyTask.fxml"));
        stage.setTitle("GoodCard");
        stage.setScene(new Scene(root, 400, 350));
        stage.show();

        ModifyTask.passInfo(selectedRow, selectedTask);
    }

    @FXML
    void deleteButt(ActionEvent event) {
        Task selectedTask = (Task) table.getSelectionModel().getSelectedItem();
        Data.deleteTask(selectedTask);
    }

    @FXML
    void optionButt(ActionEvent event) {

    }

    @FXML
    void viewButt(ActionEvent event) {

    }

    @FXML
    void reportButt(ActionEvent event) {

    }

    @FXML
    void optionDeleteButt(ActionEvent event) {
        //delete current timecard
        closeButt(event);
    }

    @FXML
    void searchTxt(ActionEvent event) {

    }

    @FXML
    void trackButt(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        table.setItems(Data.getAllTasks());
        taskCol.setCellValueFactory(new PropertyValueFactory<Task, String>("taskName"));
    }
}
