package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import application.Main;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.Node;
import javafx.stage.Stage;

public class mainMenuController implements Initializable {

	@FXML
	Button winnings;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		winnings.setText("Winnings: $" + Integer.toString(Main.getWinnings()));
	}

	public void onQuestionBoardPushed(ActionEvent event) throws IOException {
		Parent viewParent = FXMLLoader.load(getClass().getResource("view/questionBoard.fxml"));
		Scene viewScene = new Scene(viewParent);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(viewScene);
		window.show();
	}

	public void onAskAQuestion(ActionEvent event) throws IOException {
		Parent viewParent = FXMLLoader.load(getClass().getResource("view/askAQuestion.fxml"));
		Scene viewScene = new Scene(viewParent);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(viewScene);
		window.show();
	}

	public void onReset(ActionEvent event) throws IOException {
		Parent viewParent = FXMLLoader.load(getClass().getResource("view/reset.fxml"));
		Scene viewScene = new Scene(viewParent);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();  
		window.setScene(viewScene);
		window.show();
	}

	public void onExit(ActionEvent event) throws IOException {
		Platform.exit();
	}
}
