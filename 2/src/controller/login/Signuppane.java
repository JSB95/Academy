package controller.login;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import dao.MemberDao;
import dto.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Signuppane implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		labelconfirm.setText("");
		
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
    private TextField txtemail;

    @FXML
    private TextField txtaddress;

    @FXML
    void back(ActionEvent event) {
    	Login.instance.loadpage("/view/login/loginpane.fxml");

    }

    @FXML
    void signup(ActionEvent event) {
    	
    	// ��Ʈ�ѿ� �Էµ� ������ ��������
    	String id = txtid.getText();
    	String pw = txtpw.getText();
    	String pwconfirm = txtpwconfirm.getText();
    	String email = txtemail.getText();
    	String address = txtaddress.getText();
    	
    	// ���� ��¥ ��������
    	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    	String since = dateFormat.format(new Date());
    	
    	// ��ȿ�� �˻�
    		// id �ߺ�üũ
    	boolean result2 = MemberDao.memberDao.idcheck(id);
    	if (result2) {
    		labelconfirm.setText("�̹� ������� ���̵��Դϴ�.");
    		return;
    	}
    		// id ���� üũ
    	if (id.length() < 4 || id.length() > 10) {
    		labelconfirm.setText("���̵�� 4~10���� ���̷� �Է����ּ���.");
    		return;
    	}
    		// pw ���� üũ
    	if (pw.length() < 4 || pw.length() > 10 || pwconfirm.length() < 4 || pwconfirm.length() > 10) {
    		labelconfirm.setText("�н������ 4~10���� ���̷� �Է����ּ���.");
    		return;
    	}
    		// pw ��ġ üũ
    	if (!pw.equals(pwconfirm)) {
    		labelconfirm.setText("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
    		return;
    	}
    	
    		// email, address üũ
    	if (email.indexOf("@") == -1) {
    		labelconfirm.setText("�̸��� �������� �Է����ּ���.");
    		return;
    	}
    	
    	if (!(address.contains("��") && address.contains("��") && address.contains("��"))) {
    		labelconfirm.setText("�ùٸ� �ּҸ� �Է����ּ���.");
    		return;
    	}
    	
    	// ��� ��ȿ�� �˻� ��� �� DB�� ����
    	
    	Member member = new Member(0, id, pw, email, address, 0, since);
    	
    	boolean result = MemberDao.memberDao.signup(member);
    	
    	if (result) {
    		System.out.println("���� ����");
    		
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("�˸�");
    		alert.setHeaderText("������ �����մϴ�.");
    		alert.setContentText("ȸ������ ����");
    		alert.showAndWait();
    		Login.instance.loadpage("/view/login/loginpane.fxml");
    	} else {
    		labelconfirm.setText("ȸ������ ����");
    		System.err.println("���� ����");
    		return;
    	}

    }

}
