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
    		alert.setHeaderText("댓글 등록 성공");
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
    		alert.setHeaderText("게시글 수정 후 수정 완료 버튼을 눌러주세요");
    		alert.showAndWait();
    		txttitle.setEditable(true);
    		txtcontent.setEditable(true);
    		btnupdate.setText("수정완료");
    		upcheck = false;
    	} else {
    		BoardDao.boardDao.update(controller.board.Board.board.getBnum(), txttitle.getText(), txtcontent.getText());
    		alert.setHeaderText("수정이 완료되었습니다.");
    		alert.showAndWait();
    		txttitle.setEditable(false);
    		txtcontent.setEditable(false);
    		btnupdate.setText("수정");
    		upcheck = true;
    	}

    }
    @FXML
    void back(ActionEvent event) {
    	Home.home.loadpage("/view/board/board.fxml");
    }

    @FXML
    void delete(ActionEvent event) {
    	// 1. 경고 메시지 알림
    	Alert alert = new Alert(AlertType.CONFIRMATION); // 확인 / 취소가 있는 버튼
    		alert.setHeaderText("해당 게시물 삭제할까요?");
    	Optional<ButtonType> optional = alert.showAndWait(); // showAndWait() 메소드의 반환타입 => 선택한 버튼
    		// Optional 클래스 : null를 객체로 저장하는 클래스
    	if( optional.get() == ButtonType.OK ) {  // 2. 확인 버튼 눌렀을때
    		// 3. 삭제 처리 진행
    		BoardDao.boardDao.delete( 
    				controller.board.Board.board.getBnum()   );
    		// 4. 페이지 전환
    		Home.home.loadpage("/view/board/board.fxml");
    	}
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		replytableshow();
		
		Board board = controller.board.Board.board; // board컨트롤내 테이블에서 선택된 객체 호출 
		// 각 컨트롤에 선택된 board의 데이터 설정하기 
		lblwrite.setText( "작성자 : " + board.getBwrite() );
		lbldate.setText( "작성일 : " + board.getBdate() );
		lblview.setText( "조회수 : " + board.getBview() );
		txttitle.setText( board.getBtitle() );
		txtcontent.setText( board.getBcontent() );
		// 만약에 게시물 작성자 와 현재로그인된 id와 동일하지 않으면
		if( ! board.getBwrite().equals( Login.member.getMid() ) ) { // !:부정
			btndelete.setVisible(false); // 버튼 숨기기
			btnupdate.setVisible(false); // false = 버튼 숨기기 true = 버튼 보이기
		}
		// 제목 과 내용을 수정 못하게 수정 금지
		txttitle.setEditable(false);
		txtcontent.setEditable(false);
	}
	
	

}























