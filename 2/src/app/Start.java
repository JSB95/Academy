package app;

import controller.Chatting;
import controller.login.Login;
import dao.RoomDao;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Start extends Application{
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		// 컨테이너 불러오기
		Parent parent = FXMLLoader.load(getClass().getResource("/view/main.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		
		// 스테이지 로고 설정
		Image image = new Image("/img/stagelogo.jpg");	// 이미지 불러오기
			// 절대경로 : 모든 경로 / C:\Users\504\git\Academy\2\src\img\파일명.확장자
			// 상대경로 : 현위치[프로젝트 기준 src] 기준 경로
				// 생략 [src폴더로부터] /img/파일명.확장자
		stage.setResizable(false);
		stage.getIcons().add(image);
		
		// 외부 폰트
		Font.loadFont(getClass().getResourceAsStream("SANGJU Gotgam.ttf"), 14);
		// 외부 스타일
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		// 종료
		stage.setOnCloseRequest(e ->{
			if (Login.member != null) {
				if (Chatting.selectroom != null) {
					RoomDao.roomDao.roomlivedelete(Login.member.getMid());
					
					RoomDao.roomDao.roomdelete(Chatting.selectroom.getRonum());
				}
				
				Chatting.selectroom = null;
			}
		});
		
		stage.setTitle("이젠마켓");
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
