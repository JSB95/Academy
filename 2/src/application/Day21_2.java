package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Day21_2 extends Application{	// Application 클래스로부터 상속
	
	@Override
	public void start(Stage arg0) throws Exception {		// start 메소드 구현
		// TODO Auto-generated method stub
		
		// 1. FXML 파일 불러오기 : 컨테이너
		Parent parent = FXMLLoader.load(getClass().getResource("test.fxml"));
		// Parent : fxml파일(scene builder 파일)을 객체화
			// FXMLLOADER.load(getClass().getResource("경로/fxml파일명"))
		// 2. 씬 객체 생성 : 씬에 컨테이너 넣기
		Scene scene = new Scene(parent);
		// 3. 스테이지에 씬 넣기
		arg0.setScene(scene);
		// 4. 스테이지 시작
		arg0.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
