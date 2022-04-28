package controller.login;

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


public class Findpwpane implements Initializable{
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		label_idfind.setText("");
		
	}
	
	
	
	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtid;

    @FXML
    private Button btnfind;

    @FXML
    private Button btnback;

    @FXML
    private Label label_idfind;

    @FXML
    private TextField txtemail;

    @FXML
    void back(ActionEvent event) {
    	
    	Login.instance.loadpage("/view/login/loginpane.fxml");
    	
    }

    @FXML
    void findpw(ActionEvent event) {
    	
    	String id = txtid.getText();
    	String email = txtemail.getText();
    	String result = MemberDao.memberDao.findpassword(id, email);
    	if (result == null) {
    		label_idfind.setText("������ ȸ�������� �����ϴ�.");
    		System.err.println("��й�ȣ ã�� ����");
    	} else {
    		Alert alert = new Alert(AlertType.INFORMATION);
	 		alert.setTitle("�˸�");
	 		alert.setHeaderText("��й�ȣ ã��");
	 		alert.setContentText(result);
	 		alert.showAndWait();
    	}
    	

    }
	
	

}
