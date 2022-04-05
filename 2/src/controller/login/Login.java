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
	
	// 해당 클래스를 반환해주는 메소드
	public static Login instance;
	// 생성자
	public Login() {
		// TODO Auto-generated constructor stub
		instance = this;	// super : 슈퍼클래스, this : 현재클래스
		// this : 현재클래스 자체 메모리 호출
	}

	public static Member member;
	

    @FXML
    private MediaView mediaview;
    @FXML
    private BorderPane borderpane;
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		// 1. 동영상 삽입하기
			// 1) 동영상 파일 객체화
		Media media = new Media(getClass().getResource("/img/login2.mp4").toString());
		
			// 2) 미디어 뷰 객체에 동영상 넣기
		MediaPlayer mediaPlayer = new MediaPlayer(media);
			// 3) 미디어뷰에 미디어 플레이어 넣기
		mediaview.setMediaPlayer(mediaPlayer);
			// 4) 미디어 플레이어 시작
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
