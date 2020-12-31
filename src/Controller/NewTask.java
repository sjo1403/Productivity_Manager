package Controller;

import Model.Data;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NewTask {

    @FXML
    private TextField NameTxt;

    @FXML
    private TextField NumberTxt;

    @FXML
    private TextArea DescriptionFld;

    @FXML
    private Button CancelButt;

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
    void CancelButt(ActionEvent event) {
        Stage stage = (Stage) CancelButt.getScene().getWindow();
        stage.close();
    }

    @FXML
    void saveButt(ActionEvent event) {
        Data.saveTask(getName(), getNumber(), getDescription());

        CancelButt(event);
    }

}
