package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Start extends Application{
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		// �����̳� �ҷ�����
		Parent parent = FXMLLoader.load(getClass().getResource("/view/main.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		
		// �������� �ΰ� ����
		Image image = new Image("/img/stagelogo.jpg");	// �̹��� �ҷ�����
			// ������ : ��� ��� / C:\Users\504\git\Academy\2\src\img\���ϸ�.Ȯ����
			// ����� : ����ġ[������Ʈ ���� src] ���� ���
				// ���� [src�����κ���] /img/���ϸ�.Ȯ����
		stage.setResizable(false);
		stage.getIcons().add(image);
		stage.setTitle("��������");
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
