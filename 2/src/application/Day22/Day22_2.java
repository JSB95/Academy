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
		
		System.out.println("DB ����");
		
	}
	
	// method
	
	// data update
	
	public boolean write (String writer, String content) {
		
		// 1. SQL�ۼ� [DB�� ����]
			// DB�� ���̺� ������ ���� : insert into ���̺��(�ʵ��1, �ʵ��2) values(�ʵ��1�� ��, �ʵ��2�� ��)
		String sql = "insert into test(writer,content) values(?,?)";
		
		// 2. SQL���� [����� DB�� SQL ����]
			// PreparedStatement : ����� DB���� ���̺� ����(Insert, Delte, Update, Create)�Ҷ� ���� �������̽�
			
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, writer);		// SQL�� �ۼ��� ù��° ����
			ps.setString(2, content);		// SQL�� �ۼ��� �ι�° ����
			
		// 3. SQL����
			ps.executeUpdate();				// SQL ���� ����
			
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("���� ���� : " + e);
		}
		
		
		return false;
	}
	
	// data call
	
	public ArrayList<Data> get(){
		
		
		try {
			// DB���� ������ �����͸� ������ ����Ʈ ����
			ArrayList<Data> Datalist = new ArrayList<Data>();
			
			// 1. SQL �ۼ� [������ ȣ��]
				// select * (��� �ʵ�) from ���̺��
			String sql = "select * from test";
			// 2. SQL ����
			PreparedStatement ps = connection.prepareStatement(sql);
			// 3. SQL ����
			ResultSet rs = ps.executeQuery();		// ����� ��������
			// ������� �ϳ��� �ƴϰ� �������̹Ƿ� �ݺ��� ���
			while (rs.next()) {	// ������[���ڵ�]�� ������
				// 1) ����[���ڵ�]�� ��üȭ
				Data temp  = new Data();
					rs.getInt(1);		// �ش� ��[���ڵ�]�� ù��° �ʵ�[����] �� ��������
					rs.getString(2);	// �ش� ��[���ڵ�]�� �ι�° �ʵ�[����] �� ��������
					rs.getString(3);	// �ش� ��[���ڵ�]�� ����° �ʵ�[����] �� ��������
				// 2) ��ü�� ����Ʈ�� ����ֱ�
				Datalist.add(temp);
			}
			
			return Datalist;	// ������
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			System.err.println("ERROR : " + e);
			
		}
		return null; // ���н�
	}

}
