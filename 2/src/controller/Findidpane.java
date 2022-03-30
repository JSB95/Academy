package controller;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Findidpane implements Initializable{
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	 @FXML
	 private TextField txtemail;

	 @FXML
	 private Button btnfind;

	 @FXML
	 private Button btnfindid;

	 @FXML
	 private Label label_idfind;

	 @FXML
	 void back(ActionEvent event) {
		 
		 Login.login.loadpage("/view/loginpane.fxml");

	 }

	 @FXML
	 void find(ActionEvent event) {

	 }

}
