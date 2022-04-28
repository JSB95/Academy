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
    		label_idfind.setText("동일한 회원정보가 없습니다.");
    		System.err.println("비밀번호 찾기 실패");
    	} else {
    		Alert alert = new Alert(AlertType.INFORMATION);
	 		alert.setTitle("알림");
	 		alert.setHeaderText("비밀번호 찾기");
	 		alert.setContentText(result);
	 		alert.showAndWait();
    	}
    	

    }
	
	

}
