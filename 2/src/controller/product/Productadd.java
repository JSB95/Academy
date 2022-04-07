package controller.product;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.ResourceBundle;

import controller.home.Home;
import controller.login.Login;
import dao.ProductDao;
import dto.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.FileChooser.ExtensionFilter;

public class Productadd implements Initializable {


    @FXML
    private Button btnadd;

    @FXML
    private TextField txtpname;

    @FXML
    private TextArea txtpcontent;

    @FXML
    private TextField txtpprice;

    @FXML
    private Button btnimg;

    @FXML
    private RadioButton opt1;

    @FXML
    private ToggleGroup category;

    @FXML
    private RadioButton opt2;

    @FXML
    private RadioButton opt3;

    @FXML
    private RadioButton opt4;

    @FXML
    private ImageView img;

    @FXML
    private Button btnback;

    @FXML
    private Label txtpath;

    @FXML
    void add(ActionEvent event) {
    	
    	String pname = txtpname.getText();
    	String pcontent = txtpcontent.getText();
    	int pprice = Integer.parseInt(txtpprice.getText());
    	
    	String pcategory = null;
    	if (opt1.isSelected()) {
    		pcategory = "남성의류";
    	}
    	if (opt2.isSelected()) {
    		pcategory = "여성의류";
    	}
    	if (opt3.isSelected()) {
    		pcategory = "게임기기";
    	}
    	if (opt4.isSelected()) {
    		pcategory = "생활용품";
    	}
    	
    	int mnum = Login.member.getMnum();
    	
    	Product product = new Product(0, pname, pimage, pcontent, pcategory, pprice, 1, null, mnum);
    	
    	boolean result = ProductDao.productDao.add(product);
    	
    	if (result) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("제품 등록 완료");
    		alert.showAndWait();
    		Home.home.loadpage("/view/product/product.fxml");
    	}
    	

    }

    @FXML
    void back(ActionEvent event) {
    	
    	Home.home.loadpage("/view/product/product.fxml");

    }
    
    private String pimage = null;		// 여러 메소드에서 사용하기 위함

    @FXML
    void imgadd(ActionEvent event) {
    	
    	FileChooser fileChooser = new FileChooser();
    	
    	fileChooser.getExtensionFilters().add(new ExtensionFilter("이미지파일 : image file", "*png","*jpeg","*jpg","*gif"));
    	
    	File file = fileChooser.showOpenDialog(new Stage());
    	
    	txtpath.setText("파일 경로 : " + file.getPath());
    	
    	pimage = file.toURI().toString();
    	Image image = new Image(pimage);
    	img.setImage(image);
    	
    	try {
    		
    		FileInputStream inputStream = new FileInputStream(file);
    		
    		File copyfile = new File("C:/Users/504/git/Academy/2/src/img/" + file.getName());
    		
    		FileOutputStream outputStream = new FileOutputStream(copyfile);
    		
    		byte[] bytes = new byte[1024*1024*1024];
    		
    		int size;
    		
    		while ((size = inputStream.read(bytes)) > 0) {		// 읽어 올 바이트가 없을때 까지
    			outputStream.write(bytes, 0 , size);
    		}
    		inputStream.close();
    		outputStream.close();
    		pimage = copyfile.toURI().toString();
    	} catch (Exception e) {
    		System.err.println("IMAGE ADD ERROR : " + e);
    	}

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
}