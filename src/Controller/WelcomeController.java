package Controller;
import Model.Timecard;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TreeView;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WelcomeController {

    @FXML
    private TreeView<?> treeView;

    @FXML
    void aboutButt(ActionEvent event) {

    }

    /**
     *closes program
     */
    @FXML
    void closeButt(ActionEvent event) {
        System.exit(0);

    }

    @FXML
    void loadButt(ActionEvent event) {

    }

    /**
     *opens MainScreen
     */
    @FXML
    void newButt(ActionEvent event) throws IOException {

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        Timecard newTimecard = new Timecard("Shantel's GoodCard", dateFormat.format(date));

        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/View/MainScreen.fxml"));
        stage.setTitle("GoodCard");
        stage.setScene(new Scene(root, 800, 600));
        stage.show();

    }

    @FXML
    void startedButt(ActionEvent event) {

    }

}
