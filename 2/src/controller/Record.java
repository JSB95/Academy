package controller;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

import dao.MemberDao;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

public class Record implements Initializable {

	@FXML
	private Label lblmtotal; // fxid 객체화
	@FXML
	private Label lblptotal; // fxid 객체화
	@FXML
	private Label lblbtotal; // fxid 객체화
	@SuppressWarnings("rawtypes")
	@FXML
	private BarChart mbc;
	@FXML
	private BarChart bbc;
	@FXML
	private BarChart pbc;
	@FXML
	private PieChart ppc;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// 전체 회원수 
		int mtotal = MemberDao.memberDao.counttotal("member");
		lblmtotal.setText( mtotal+" 명");
		// 전체 제품수 
		int ptotal = MemberDao.memberDao.counttotal("product");
		lblptotal.setText( ptotal+" 개");
		// 전체 게시물수 
		int btotal = MemberDao.memberDao.counttotal("board");
		lblbtotal.setText( btotal+" 개");
		
		XYChart.Series series = new XYChart.Series<>();
		Map<String, Integer> map = MemberDao.memberDao.datetotal("member", "msince");
		
		for (String key : map.keySet()) {
			XYChart.Data data = new XYChart.Data<>(key, map.get(key));
			series.getData().add(data);
		}
		
		mbc.getData().add(series);
		
		XYChart.Series series2 = new XYChart.Series<>();
		Map<String, Integer> map2 = MemberDao.memberDao.datetotal("board","bdate");
		for (String key : map2.keySet()) {
			XYChart.Data data = new XYChart.Data<>(key, map2.get(key));
			series2.getData().add(data);
		}
		
		bbc.getData().add(series2);
		
		XYChart.Series series3 = new XYChart.Series<>();

		series3.setName("국어점수"); // * 계열명 

		// 2. 데이터 선언 ( x축값 , y축값 )
		XYChart.Data data = new XYChart.Data<>("신동엽" , 10);
		// 3. 계열에 데이터 추가
		series3.getData().add(data);

		XYChart.Data data2 = new XYChart.Data<>("강호동" , 20);
		series3.getData().add(data2);

		XYChart.Data data3 = new XYChart.Data<>("유재석" , 15);
		series3.getData().add(data3);

		// 4. 차트에 계열추가
		pbc.getData().add(series3);

		XYChart.Series series4 = new XYChart.Series<>();
		series4.setName("영어점수");

		XYChart.Data data4 = new XYChart.Data<>("신동엽" , 25); // 2. 데이터 선언 ( x축값 , y축값 )
		series4.getData().add(data4); // 3. 계열에 데이터 추가

		XYChart.Data data5 = new XYChart.Data<>("강호동" , 40);
		series4.getData().add(data5);

		XYChart.Data data6 = new XYChart.Data<>("유재석" , 50);
		series4.getData().add(data6);

		pbc.getData().add(series4);
		
		ObservableList<PieChart.Data> list = FXCollections.observableArrayList();
		Map<String, Integer> map3 = MemberDao.memberDao.countcategory();
		for (String key : map3.keySet()) {
			PieChart.Data temp = new PieChart.Data(key, map3.get(key));
			list.add(temp);
		}
		ppc.setData(list);

	}
}