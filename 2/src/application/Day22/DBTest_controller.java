package application.Day22;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DBTest_controller implements Initializable{
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		try {
			Day22_2 DB = new Day22_2();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

    @FXML
    private TextField txt_writer;

    @FXML
    private TextField txt_content;

    @FXML
    private Button btn_get;

    @FXML
    private Button btn_write;

    @FXML
    private TextArea txt_contentlist;

    @FXML
    void get(ActionEvent event) {
    	
    	System.out.println("DB에 데이터를 호출합니다.");
    	
    	
    	try {
    		// 1. DB 연동 객체 만들기
			Day22_2 DB_connect = new Day22_2();
			// 2. DB 객체 내 메소드 호출 후 결과를 리스트로 받기
			ArrayList<Data> Datalist = DB_connect.get();
			// 3. 리스트를 컨트롤에 넣어주기
			for (Data temp : Datalist) {
				
				// txtcontentlist.appendText : 해당 컨트롤에 내용 추가
				txt_contentlist.appendText("번호 : " + temp.getNum() + "\t\t작성자 : " + temp.getWriter() + "\t\t내용 : " + temp.getContent() + "\n");
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }

    @FXML
    void write(ActionEvent event) {
    	
    	System.out.println("DB에 데이터를 저장합니다.");
    	
    	String writer = txt_writer.getText();
    	String content = txt_content.getText();
    	
    	// 1. DB 연동 객체 만들기
    	try {
			Day22_2 DB_connect = new Day22_2();
			
			boolean result = DB_connect.write(writer, content);
			
			if (result) {
				System.out.println("DB저장 성공");
				
				// 성공 시 컨트롤에 입력된 데이터 지워주기
					// fxid명.setText() : 해당 컨트롤에 값 넣기 -> 공백으로
				txt_writer.setText("");
				txt_content.setText("");
				
			} else {
				System.err.println("DB저장 실패");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

}
