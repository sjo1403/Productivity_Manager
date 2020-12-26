package Controller;

import Model.Data;
import Model.Project;
import Model.Task;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class NewProject implements Initializable {

    private ObservableList<Task> addedTasks = FXCollections.observableArrayList();

    @FXML
    private Button mainCancelButt;

    @FXML
    private TextField pNameTxt;

    @FXML
    private TextField pNumberTxt;

    @FXML
    private TextArea pDescriptFld;

    @FXML
    private TextField tNameTxt;

    @FXML
    private TextField tNumberTxt;

    @FXML
    private TextArea tDescripFld;

    @FXML
    private TextField searchTxt;

    @FXML
    private TableView<Task> table;

    @FXML
    private TableColumn<Task, String> taskCol;

    @FXML
    void addButt(ActionEvent event) {

        String taskName = tNameTxt.getText();
        String taskNumber = tNumberTxt.getText();
        String taskDescription = tDescripFld.getText();

        Task newTask = new Task(taskName, taskNumber, taskDescription);
        addedTasks.add(newTask);

        tNameTxt.setText("");
        tNumberTxt.setText("");
        tDescripFld.setText("");

    }

    @FXML
    void deleteButt(ActionEvent event) {

        Task selectedItem = table.getSelectionModel().getSelectedItem();
        addedTasks.remove(selectedItem);
    }

    @FXML
    void mainCancelButt(ActionEvent event) {

        if (addedTasks == null || !addedTasks.isEmpty()) {

            addedTasks.clear();
        }

        Stage stage = (Stage) mainCancelButt.getScene().getWindow();
        stage.close();
    }

    @FXML
    void modifyButt(ActionEvent event) {

    }

    @FXML
    void saveButt(ActionEvent event) {

        String projectName = pNameTxt.getText();
        String projectNumber = pNumberTxt.getText();
        String projectDescription = pDescriptFld.getText();

        Project newProject = new Project(projectName, projectNumber, projectDescription);

        Data.addProject(newProject);
        System.out.println(newProject);
        newProject.addAssociatedTasks(addedTasks);
        System.out.println(newProject.getAssociatedTasks());

        addedTasks.clear();
        mainCancelButt(event);
    }

    @FXML
    void taskCancelButt(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        table.setItems(addedTasks);

        taskCol.setCellValueFactory(new PropertyValueFactory<Task, String>("taskName"));
    }
}
