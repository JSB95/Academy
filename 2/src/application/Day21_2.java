package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Day21_2 extends Application{	// Application Ŭ�����κ��� ���
	
	@Override
	public void start(Stage arg0) throws Exception {		// start �޼ҵ� ����
		// TODO Auto-generated method stub
		
		// 1. FXML ���� �ҷ����� : �����̳�
		Parent parent = FXMLLoader.load(getClass().getResource("test.fxml"));
		// Parent : fxml����(scene builder ����)�� ��üȭ
			// FXMLLOADER.load(getClass().getResource("���/fxml���ϸ�"))
		// 2. �� ��ü ���� : ���� �����̳� �ֱ�
		Scene scene = new Scene(parent);
		// 3. ���������� �� �ֱ�
		arg0.setScene(scene);
		// 4. �������� ����
		arg0.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
