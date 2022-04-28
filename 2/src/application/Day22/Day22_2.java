package application.Day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Day22_2 {
	
	// field
	private Connection connection; 
	
	// constructor
	public Day22_2() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated constructor stub
		
		// DB Drive Class call
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC", "root", "1234");
		
		System.out.println("DB 연동");
		
	}
	
	// method
	
	// data update
	
	public boolean write (String writer, String content) {
		
		// 1. SQL작성 [DB에 쓰기]
			// DB내 테이블에 데이터 저장 : insert into 테이블명(필드명1, 필드명2) values(필드명1의 값, 필드명2의 값)
		String sql = "insert into test(writer,content) values(?,?)";
		
		// 2. SQL설정 [연결된 DB에 SQL 설정]
			// PreparedStatement : 연결된 DB에서 테이블 조작(Insert, Delte, Update, Create)할때 쓰는 인터페이스
			
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, writer);		// SQL내 작성한 첫번째 변수
			ps.setString(2, content);		// SQL내 작성한 두번째 변수
			
		// 3. SQL실행
			ps.executeUpdate();				// SQL 삽입 실행
			
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("연결 실패 : " + e);
		}
		
		
		return false;
	}
	
	// data call
	
	public ArrayList<Data> get(){
		
		
		try {
			// DB에서 가져온 데이터를 저장할 리스트 선언
			ArrayList<Data> Datalist = new ArrayList<Data>();
			
			// 1. SQL 작성 [데이터 호출]
				// select * (모든 필드) from 테이블명
			String sql = "select * from test";
			// 2. SQL 조작
			PreparedStatement ps = connection.prepareStatement(sql);
			// 3. SQL 실행
			ResultSet rs = ps.executeQuery();		// 결과물 가져오기
			// 결과물이 하나가 아니고 여러개이므로 반복문 사용
			while (rs.next()) {	// 다음줄[레코드]이 있으면
				// 1) 한줄[레코드]씩 객체화
				Data temp  = new Data();
					rs.getInt(1);		// 해당 줄[레코드]의 첫번째 필드[세로] 값 가져오기
					rs.getString(2);	// 해당 줄[레코드]의 두번째 필드[세로] 값 가져오기
					rs.getString(3);	// 해당 줄[레코드]의 세번째 필드[세로] 값 가져오기
				// 2) 객체를 리스트에 담아주기
				Datalist.add(temp);
			}
			
			return Datalist;	// 성공시
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			System.err.println("ERROR : " + e);
			
		}
		return null; // 실패시
	}

}
