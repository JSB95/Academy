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
    	
    	// 컨트롤에 입력된 데이터 가져오기
    	String id = txtid.getText();
    	String pw = txtpw.getText();
    	String pwconfirm = txtpwconfirm.getText();
    	String email = txtemail.getText();
    	String address = txtaddress.getText();
    	
    	// 현재 날짜 가져오기
    	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    	String since = dateFormat.format(new Date());
    	
    	// 유효성 검사
    		// id 중복체크
    	boolean result2 = MemberDao.memberDao.idcheck(id);
    	if (result2) {
    		labelconfirm.setText("이미 사용중인 아이디입니다.");
    		return;
    	}
    		// id 형식 체크
    	if (id.length() < 4 || id.length() > 10) {
    		labelconfirm.setText("아이디는 4~10글자 사이로 입력해주세요.");
    		return;
    	}
    		// pw 형식 체크
    	if (pw.length() < 4 || pw.length() > 10 || pwconfirm.length() < 4 || pwconfirm.length() > 10) {
    		labelconfirm.setText("패스워드는 4~10글자 사이로 입력해주세요.");
    		return;
    	}
    		// pw 일치 체크
    	if (!pw.equals(pwconfirm)) {
    		labelconfirm.setText("비밀번호가 일치하지 않습니다.");
    		return;
    	}
    	
    		// email, address 체크
    	if (email.indexOf("@") == -1) {
    		labelconfirm.setText("이메일 형식으로 입력해주세요.");
    		return;
    	}
    	
    	if (!(address.contains("시") && address.contains("구") && address.contains("동"))) {
    		labelconfirm.setText("올바른 주소를 입력해주세요.");
    		return;
    	}
    	
    	// 모든 유효성 검사 통과 시 DB에 저장
    	
    	Member member = new Member(0, id, pw, email, address, 0, since);
    	
    	boolean result = MemberDao.memberDao.signup(member);
    	
    	if (result) {
    		System.out.println("가입 성공");
    		
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("알림");
    		alert.setHeaderText("가입을 축하합니다.");
    		alert.setContentText("회원가입 성공");
    		alert.showAndWait();
    		Login.instance.loadpage("/view/login/loginpane.fxml");
    	} else {
    		labelconfirm.setText("회원가입 실패");
    		System.err.println("가입 실패");
    		return;
    	}

    }

}
