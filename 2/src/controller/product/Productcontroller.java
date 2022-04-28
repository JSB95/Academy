package controller.product;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import controller.home.Home;
import dao.ProductDao;
import dto.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class Productcontroller implements Initializable{
	
	@FXML
	private ScrollPane scrollpane;
	
	@FXML
	private VBox vbox;

	@FXML
	private Button btnadd;
	
	@FXML
	private TextField txtsearch;
	
	@FXML
	private Button btnsearch;

	@FXML
	void accadd(ActionEvent event) {
		Home.home.loadpage("/view/product/productadd.fxml");
	}
	
	@FXML
	void search (ActionEvent event) {
		String search = txtsearch.getText();
		show(search);
	}
	
	void show (String search) {
		
		if (vbox.getChildren().isEmpty() == false) {
			vbox.getChildren().remove(0);
		}
		
		ArrayList<Product> productlist = ProductDao.productDao.list(Home.category, search);
		
		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets(10));
		gridPane.setHgap(20);
		gridPane.setVgap(20);
		
		int i = 0;
		
		for (int row = 0; row < productlist.size() / 3; row++) {
			for (int col = 0; col < 3; col++) {
				ImageView imageView = new ImageView(new Image(productlist.get(i).getPimg()));
				
				imageView.setFitWidth(250);
				imageView.setFitHeight(200);
				
				Button button = new Button(null, imageView);
				button.setStyle("-fx-background-color:transparent");
				button.setId(i+"");
				button.setOnAction(e -> {
					int id = Integer.parseInt(e.toString().split(",")[0].split("=")[2]);
					select = productlist.get(id);
					Home.home.loadpage("/view/product/productview.fxml");
				});
				gridPane.add(button, col, row);
				
				i++;
			}
		}
		
		int row = productlist.size() / 3;
		int remain = productlist.size() % 3;
		if (remain != 0) {
			for (int col = 0; col < remain; col++) {
				ImageView imageView = new ImageView(new Image(productlist.get(i).getPimg()));
				
				imageView.setFitWidth(250);
				imageView.setFitHeight(200);
				
				Button button = new Button(null, imageView);
				button.setStyle("-fx-background-color:transparent");
				button.setId(i+"");
				button.setOnAction(e -> {
					int id = Integer.parseInt(e.toString().split(",")[0].split("=")[2]);
					select = productlist.get(id);
					Home.home.loadpage("/view/product/productview.fxml");
				});
				
				gridPane.add(button, col, row);
				
				i++;
			}
		}
		
		vbox.getChildren().add(gridPane);
		
	}
	
	public static Product select;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

		
		show (null);
		
	}
	
   

}
