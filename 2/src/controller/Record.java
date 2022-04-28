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
	private Label lblmtotal; // fxid ��üȭ
	@FXML
	private Label lblptotal; // fxid ��üȭ
	@FXML
	private Label lblbtotal; // fxid ��üȭ
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
		// ��ü ȸ���� 
		int mtotal = MemberDao.memberDao.counttotal("member");
		lblmtotal.setText( mtotal+" ��");
		// ��ü ��ǰ�� 
		int ptotal = MemberDao.memberDao.counttotal("product");
		lblptotal.setText( ptotal+" ��");
		// ��ü �Խù��� 
		int btotal = MemberDao.memberDao.counttotal("board");
		lblbtotal.setText( btotal+" ��");
		
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

		series3.setName("��������"); // * �迭�� 

		// 2. ������ ���� ( x�ప , y�ప )
		XYChart.Data data = new XYChart.Data<>("�ŵ���" , 10);
		// 3. �迭�� ������ �߰�
		series3.getData().add(data);

		XYChart.Data data2 = new XYChart.Data<>("��ȣ��" , 20);
		series3.getData().add(data2);

		XYChart.Data data3 = new XYChart.Data<>("���缮" , 15);
		series3.getData().add(data3);

		// 4. ��Ʈ�� �迭�߰�
		pbc.getData().add(series3);

		XYChart.Series series4 = new XYChart.Series<>();
		series4.setName("��������");

		XYChart.Data data4 = new XYChart.Data<>("�ŵ���" , 25); // 2. ������ ���� ( x�ప , y�ప )
		series4.getData().add(data4); // 3. �迭�� ������ �߰�

		XYChart.Data data5 = new XYChart.Data<>("��ȣ��" , 40);
		series4.getData().add(data5);

		XYChart.Data data6 = new XYChart.Data<>("���缮" , 50);
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