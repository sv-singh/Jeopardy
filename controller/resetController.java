package controller;

import java.io.File;
import java.io.IOException;
import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.stage.Stage;

public class resetController {

    public void onYesButton(ActionEvent event) throws IOException {
        Main.setWinnings(0);
        Main.addAnsweredQuestion(null);
        File w = new File("winnings");
        w.delete();
        File a = new File("answeredQuestions");
        a.delete();
        Parent viewParent = FXMLLoader.load(getClass().getResource("view/home.fxml"));
        Scene viewScene = new Scene(viewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(viewScene);
        window.show();
    }

    public void onNoButton(ActionEvent event) throws IOException {
        Parent viewParent = FXMLLoader.load(getClass().getResource("view/mainMenu.fxml"));
        Scene viewScene = new Scene(viewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(viewScene);
        window.show();
    }
}
