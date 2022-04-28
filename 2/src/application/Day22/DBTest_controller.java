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
    	
    	System.out.println("DB�� �����͸� ȣ���մϴ�.");
    	
    	
    	try {
    		// 1. DB ���� ��ü �����
			Day22_2 DB_connect = new Day22_2();
			// 2. DB ��ü �� �޼ҵ� ȣ�� �� ����� ����Ʈ�� �ޱ�
			ArrayList<Data> Datalist = DB_connect.get();
			// 3. ����Ʈ�� ��Ʈ�ѿ� �־��ֱ�
			for (Data temp : Datalist) {
				
				// txtcontentlist.appendText : �ش� ��Ʈ�ѿ� ���� �߰�
				txt_contentlist.appendText("��ȣ : " + temp.getNum() + "\t\t�ۼ��� : " + temp.getWriter() + "\t\t���� : " + temp.getContent() + "\n");
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }

    @FXML
    void write(ActionEvent event) {
    	
    	System.out.println("DB�� �����͸� �����մϴ�.");
    	
    	String writer = txt_writer.getText();
    	String content = txt_content.getText();
    	
    	// 1. DB ���� ��ü �����
    	try {
			Day22_2 DB_connect = new Day22_2();
			
			boolean result = DB_connect.write(writer, content);
			
			if (result) {
				System.out.println("DB���� ����");
				
				// ���� �� ��Ʈ�ѿ� �Էµ� ������ �����ֱ�
					// fxid��.setText() : �ش� ��Ʈ�ѿ� �� �ֱ� -> ��������
				txt_writer.setText("");
				txt_content.setText("");
				
			} else {
				System.err.println("DB���� ����");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

}
