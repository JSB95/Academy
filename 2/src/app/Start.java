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
		
		// �ܺ� ��Ʈ
		Font.loadFont(getClass().getResourceAsStream("SANGJU Gotgam.ttf"), 14);
		// �ܺ� ��Ÿ��
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		// ����
		stage.setOnCloseRequest(e ->{
			if (Login.member != null) {
				if (Chatting.selectroom != null) {
					RoomDao.roomDao.roomlivedelete(Login.member.getMid());
					
					RoomDao.roomDao.roomdelete(Chatting.selectroom.getRonum());
				}
				
				Chatting.selectroom = null;
			}
		});
		
		stage.setTitle("��������");
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
