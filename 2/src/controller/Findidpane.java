package controller;


import java.net.URL;
import java.util.ResourceBundle;

import dao.MemberDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;


public class Findidpane implements Initializable{
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		label_idfind.setText("");
		
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
		 
	    String email = txtemail.getText();
	    
	    String result = MemberDao.memberDao.findid(email);
	    if (result == null) {
	    	label_idfind.setText("������ ȸ�������� �����ϴ�.");
	    	System.err.println("���̵� ã�� ����");
	    } else {
	    	Alert alert = new Alert(AlertType.INFORMATION);
	 		alert.setTitle("�˸�");
	 		alert.setHeaderText("���̵� ã��");
	 		alert.setContentText(result);
	 		alert.showAndWait();
	    	
	    }
	   
	    
	    

	 }

}
