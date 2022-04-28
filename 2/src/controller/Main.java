package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.MediaView;
import javafx.fxml.Initializable;

public class Main implements Initializable{
							// Initializable : view가 열렸을 때 초기값 설정 메소드 제공
	
	public static Main instance;
	
	public Main() {
		// TODO Auto-generated constructor stub
		instance = this;
	}

    @FXML
    private MediaView mediaview;

    @FXML
    private BorderPane borderpane;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	// TODO Auto-generated method stub
		System.out.println("Main view run");
		loadpage("/view/login/login");
			
	}

	public void loadpage(String page) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource(page + ".fxml"));
			borderpane.setCenter(parent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}

}
