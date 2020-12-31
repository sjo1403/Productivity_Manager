package Controller;

import Model.Data;
import Model.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ModifyTask implements Initializable {

    @FXML
    private TextField NameTxt;

    @FXML
    private TextField NumberTxt;

    @FXML
    private TextArea DescriptionFld;

    private static int row;

    private static Task oldTask;

    public String getName() {
        return NameTxt.getText();
    }

    public String  getNumber() {
        return NumberTxt.getText();
    }

    public String  getDescription() {
        return DescriptionFld.getText();
    }

    @FXML
    private Button CancelButt;

    @FXML
    void CancelButt(ActionEvent event) {
        Stage stage = (Stage) CancelButt.getScene().getWindow();
        stage.close();
    }

    @FXML
    public static void passInfo(int selectedRow, Task selectedTask) {
        row = selectedRow;
        oldTask = selectedTask;
    }

    @FXML
    void saveButt(ActionEvent event) {
        Data.modify(row, getName(), getNumber(), getDescription());
        CancelButt(event);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        NameTxt.setText(oldTask.getTaskName());
        NumberTxt.setText(oldTask.getTaskNumber());
        DescriptionFld.setText(oldTask.getTaskDescription());
    }
}
