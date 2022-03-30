package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Signuppane implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpw;

    @FXML
    private Button btnsignup;

    @FXML
    private Button btnfindid;

    @FXML
    private Label labelconfirm;

    @FXML
    private PasswordField txtpwconfirm;

    @FXML
    private PasswordField txtemail;

    @FXML
    private PasswordField txtaddress;

    @FXML
    void back(ActionEvent event) {
    	Login.login.loadpage("/view/loginpane.fxml");

    }

    @FXML
    void signup(ActionEvent event) {

    }

}
