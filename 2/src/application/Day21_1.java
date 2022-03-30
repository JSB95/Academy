package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Day21_1 extends Application{
				// extend : 상속 [Application : JAVAFX 관련 클래스]
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		// JAVAFX를 실행하는 메소드 [추상 -> 구현]
			// start
		// 1. 컨테이너 만들기 [여러개 컨트롤 세로로 저장]
		VBox box = new VBox();
		// 2. 컨트롤 만들기
		Button button = new Button();
		button.setText("닫기");
		button.setOnAction(e -> Platform.exit());	
					// 값 -> 인수 : 람다식
		// 3. 컨테이너에 컨트롤 넣기
		box.getChildren().add(button);
		// 4. scene
		Scene scene = new Scene(box, 500 ,500);		// 컨테이너이름, 가로길이, 세로길이
		// 5. 스테이지에 scene
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);			// start 메소드 호출
	}

}
