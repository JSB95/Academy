package controller.board;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import controller.home.Home;
import controller.login.Login;
import dao.BoardDao;
import dto.Board;
import dto.Reply;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Boardview implements Initializable {
	

    @FXML
    private Button btnrewrite;

    @FXML
    private TextField txttitle;

    @FXML
    private TextArea txtcontent;

    @FXML
    private Button btnback;

    @FXML
    private Button btndelete;

    @FXML
    private Button btnupdate;

    @FXML
    private Label lblwrite;

    @FXML
    private Label lbldate;

    @FXML
    private Label lblview;

    @FXML
    private TextArea txtrecontent;

    @FXML
    private TableView<Reply> replytable;
    

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void replytableshow() {
    	int bnum = controller.board.Board.board.getBnum();
    	ObservableList<Reply> replylist = BoardDao.boardDao.replylist(bnum);
    	
    	TableColumn tc = replytable.getColumns().get(0);
    	tc.setCellValueFactory(new PropertyValueFactory<>("rnum"));
    	
    	tc = replytable.getColumns().get(1);
    	tc.setCellValueFactory(new PropertyValueFactory<>("rwrite"));
    	
    	tc = replytable.getColumns().get(2);
    	tc.setCellValueFactory(new PropertyValueFactory<>("rdate"));
    	
    	tc = replytable.getColumns().get(3);
    	tc.setCellValueFactory(new PropertyValueFactory<>("rcontent"));
    	
    	replytable.setItems(replylist);
    }

 
    @FXML
    void rewrite(ActionEvent event) {
    	
    	String rcontent = txtrecontent.getText();
    	String rwrite = Login.member.getMid();
    	int bnum = controller.board.Board.board.getBnum();
    	Reply reply = new Reply(0, rcontent, rwrite, null, bnum);
    	boolean result = BoardDao.boardDao.rwrite(reply);
    	if (result) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("???? ???? ????");
    		alert.showAndWait();
    		txtrecontent.setText("");
    	}
    	
    	replytableshow();

    }
    
    boolean upcheck = true;

    @FXML
    void update(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
    	if (upcheck) {
    		alert.setHeaderText("?????? ???? ?? ???? ???? ?????? ??????????");
    		alert.showAndWait();
    		txttitle.setEditable(true);
    		txtcontent.setEditable(true);
    		btnupdate.setText("????????");
    		upcheck = false;
    	} else {
    		BoardDao.boardDao.update(controller.board.Board.board.getBnum(), txttitle.getText(), txtcontent.getText());
    		alert.setHeaderText("?????? ??????????????.");
    		alert.showAndWait();
    		txttitle.setEditable(false);
    		txtcontent.setEditable(false);
    		btnupdate.setText("????");
    		upcheck = true;
    	}

    }
    @FXML
    void back(ActionEvent event) {
    	Home.home.loadpage("/view/board/board.fxml");
    }

    @FXML
    void delete(ActionEvent event) {
    	// 1. ???? ?????? ????
    	Alert alert = new Alert(AlertType.CONFIRMATION); // ???? / ?????? ???? ????
    		alert.setHeaderText("???? ?????? ???????????");
    	Optional<ButtonType> optional = alert.showAndWait(); // showAndWait() ???????? ???????? => ?????? ????
    		// Optional ?????? : null?? ?????? ???????? ??????
    	if( optional.get() == ButtonType.OK ) {  // 2. ???? ???? ????????
    		// 3. ???? ???? ????
    		BoardDao.boardDao.delete( 
    				controller.board.Board.board.getBnum()   );
    		// 4. ?????? ????
    		Home.home.loadpage("/view/board/board.fxml");
    	}
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		replytableshow();
		
		Board board = controller.board.Board.board; // board???????? ?????????? ?????? ???? ???? 
		// ?? ???????? ?????? board?? ?????? ???????? 
		lblwrite.setText( "?????? : " + board.getBwrite() );
		lbldate.setText( "?????? : " + board.getBdate() );
		lblview.setText( "?????? : " + board.getBview() );
		txttitle.setText( board.getBtitle() );
		txtcontent.setText( board.getBcontent() );
		// ?????? ?????? ?????? ?? ???????????? id?? ???????? ??????
		if( ! board.getBwrite().equals( Login.member.getMid() ) ) { // !:????
			btndelete.setVisible(false); // ???? ??????
			btnupdate.setVisible(false); // false = ???? ?????? true = ???? ??????
		}
		// ???? ?? ?????? ???? ?????? ???? ????
		txttitle.setEditable(false);
		txtcontent.setEditable(false);
	}
	
	

}























