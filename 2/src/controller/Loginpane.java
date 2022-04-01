package controller;

import java.net.URL;
import java.util.ResourceBundle;

import dao.MemberDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Loginpane implements Initializable{
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		label.setText("");
		
	}
	
	@FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpw;

    @FXML
    private Button btnlogin;

    @FXML
    private Button btnsignup;

    @FXML
    private Button btnfindpw;

    @FXML
    private Button btnfindid;

    @FXML
    private Label label;
    
    @FXML
    void accfindid(ActionEvent event) {
    	System.out.println("아이디찾기 페이지로 이동");
    	Login.login.loadpage("/view/findidpane.fxml");
    	
    }

    @FXML
    void accfindpassword(ActionEvent event) {
    	System.out.println("패스워드찾기 페이지로 이동 ");
    	Login.login.loadpage("/view/findpwpane.fxml");
    }

    @FXML
    void accsignup(ActionEvent event) {
//    	System.out.println("회원가입 페이지로 이동 ");
    	// login 컨트롤에 존재하는 borderpane 객체 내 센터 변경
    		// * 문제 : borderpane 객체가 다른 컨트롤에 있다.
    	Login.login.loadpage("/view/signuppane.fxml");
    }

    @FXML
    void login(ActionEvent event) {
    	System.out.println("로그인처리");
    	
    	String id = txtid.getText();
    	String pw = txtpw.getText();
    	
    	boolean result = MemberDao.memberDao.login(id, pw);
    	if (result) {
    		label.setText("로그인 성공");
    	} else {
    		label.setText("동일한 회원정보가 없습니다.");
    	}
    }
    
}