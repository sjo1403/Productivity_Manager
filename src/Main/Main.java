package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/View/WelcomeScreen.fxml"));
        primaryStage.setTitle("Welcome to GoodCard!");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();

        String token = "cb0a82bfe087eb6d2102c4eb355231e665ec61d0";
    }


    public static void main(String[] args) {
        launch(args);
    }
}
