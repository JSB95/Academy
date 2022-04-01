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
    	System.out.println("���̵�ã�� �������� �̵�");
    	Login.login.loadpage("/view/findidpane.fxml");
    	
    }

    @FXML
    void accfindpassword(ActionEvent event) {
    	System.out.println("�н�����ã�� �������� �̵� ");
    	Login.login.loadpage("/view/findpwpane.fxml");
    }

    @FXML
    void accsignup(ActionEvent event) {
//    	System.out.println("ȸ������ �������� �̵� ");
    	// login ��Ʈ�ѿ� �����ϴ� borderpane ��ü �� ���� ����
    		// * ���� : borderpane ��ü�� �ٸ� ��Ʈ�ѿ� �ִ�.
    	Login.login.loadpage("/view/signuppane.fxml");
    }

    @FXML
    void login(ActionEvent event) {
    	System.out.println("�α���ó��");
    	
    	String id = txtid.getText();
    	String pw = txtpw.getText();
    	
    	boolean result = MemberDao.memberDao.login(id, pw);
    	if (result) {
    		label.setText("�α��� ����");
    	} else {
    		label.setText("������ ȸ�������� �����ϴ�.");
    	}
    }
    
}