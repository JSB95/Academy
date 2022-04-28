package controller.login;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dto.Member;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.fxml.Initializable;

public class Login implements Initializable{
	
	// �ش� Ŭ������ ��ȯ���ִ� �޼ҵ�
	public static Login instance;
	// ������
	public Login() {
		// TODO Auto-generated constructor stub
		instance = this;	// super : ����Ŭ����, this : ����Ŭ����
		// this : ����Ŭ���� ��ü �޸� ȣ��
	}

	public static Member member;
	

    @FXML
    private MediaView mediaview;
    @FXML
    private BorderPane borderpane;
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		// 1. ������ �����ϱ�
			// 1) ������ ���� ��üȭ
		Media media = new Media(getClass().getResource("/img/login2.mp4").toString());
		
			// 2) �̵�� �� ��ü�� ������ �ֱ�
		MediaPlayer mediaPlayer = new MediaPlayer(media);
			// 3) �̵��信 �̵�� �÷��̾� �ֱ�
		mediaview.setMediaPlayer(mediaPlayer);
			// 4) �̵�� �÷��̾� ����
		mediaPlayer.play();
		System.out.println(mediaPlayer);
		loadpage("/view/login/loginpane.fxml");
		
	}
	
	public void loadpage(String page) {
		try {
			Parent parent = FXMLLoader.load( getClass().getResource(page) );
			borderpane.setCenter(parent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
