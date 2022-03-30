package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Day21_1 extends Application{
				// extend : ��� [Application : JAVAFX ���� Ŭ����]
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		// JAVAFX�� �����ϴ� �޼ҵ� [�߻� -> ����]
			// start
		// 1. �����̳� ����� [������ ��Ʈ�� ���η� ����]
		VBox box = new VBox();
		// 2. ��Ʈ�� �����
		Button button = new Button();
		button.setText("�ݱ�");
		button.setOnAction(e -> Platform.exit());	
					// �� -> �μ� : ���ٽ�
		// 3. �����̳ʿ� ��Ʈ�� �ֱ�
		box.getChildren().add(button);
		// 4. scene
		Scene scene = new Scene(box, 500 ,500);		// �����̳��̸�, ���α���, ���α���
		// 5. ���������� scene
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);			// start �޼ҵ� ȣ��
	}

}
