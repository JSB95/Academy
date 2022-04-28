package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Product;

public class ProductDao {
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public static ProductDao productDao = new ProductDao();
	
	public ProductDao() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC","root","1234");
			

		} catch (Exception e) {
			System.err.println("ProductDao ERROR : " + e);
		}
		
	}
	
	public boolean add (Product product) {
		try {
		String sql = "INSERT INTO product(pname, pimg, pcontent, pcategory, pprice, pactivation, mnum) VALUES (?, ?, ?, ?, ?, ?, ?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, product.getPname());
		ps.setString(2, product.getPimg());
		ps.setString(3, product.getPcontent());
		ps.setString(4, product.getPcategory());
		ps.setInt(5, product.getPprice());
		ps.setInt(6, product.getPactivation());
		ps.setInt(7, product.getMnum());
		ps.executeUpdate();
		return true;
		} catch (Exception e) {
			System.err.println("PRODUCT ADD ERROR : " + e);
		}
		return false;
	}
	
	public ArrayList<Product> list(String category, String search){
		
		ArrayList<Product> productlist = new ArrayList<>();
		
		try {
			String sql = null;
			if (category == null && search == null) {
				sql = "SELECT * FROM product";
				ps = con.prepareStatement(sql);
			} else if (search == null) {

				sql = "SELECT * FROM product WHERE pcategory = ? ORDER BY pnum DESC";
				ps = con.prepareStatement(sql);
				ps.setString(1, category);
				
			} else {
				sql = "SELECT * FROM product WHERE pcategory = ? AND pname like '%"+search+"%' ORDER BY pnum DESC";
				ps = con.prepareStatement(sql);
				ps.setString(1, category);
			}
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				
				Product product = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getInt(9));
				
				productlist.add(product);
				
			}
			
			return productlist;
			
		} catch (Exception e) {
			
			System.err.println("PRODUCT LIST ERROR : " + e);
			
		}
		
		return null;
		
	}
	
	public boolean delete (int pnum) {
		try {
			String sql = "DELETE FROM product WHERE pnum = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, pnum);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.err.println("DELETE ERROR : " + e);
		}
		return false;
	}
	
	public boolean update (Product product) {
		try {
			String sql = "UPDATE product SET pname = ?, pimg = ?, pcontent = ?, pcategory = ?, pprice = ? WHERE pnum = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, product.getPname());
			ps.setString(2, product.getPimg());
			ps.setString(3, product.getPcontent());
			ps.setString(4, product.getPcategory());
			ps.setInt(5, product.getPprice());
			ps.setInt(6, product.getPnum());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.err.println("UPDATE ERROR" + e);
		}
		return false;
	}
	
	public boolean activation (int pnum) {
		
		try {
			String sql = "SELECT pactivation FROM product WHERE pnum = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, pnum);
			rs = ps.executeQuery();
			if (rs.next()) {
				String upsql = null;
				if (rs.getInt(1) == 1) {
					upsql = "UPDATE product SET pactivation = 2 WHERE pnum = ?";
				} else if (rs.getInt(1) == 2) {
					upsql = "UPDATE product SET pactivation = 3 WHERE pnum = ?";
				} else if (rs.getInt(1) == 3) {
					upsql = "UPDATE product SET pactivation = 1 WHERE pnum = ?";
				}
				
				ps = con.prepareStatement(upsql);
				ps.setInt(1, pnum);
				ps.executeUpdate();
				return true;
			}
		} catch (Exception e) {
			System.err.println("ACTIVATION ERROR : " + e);
		}
		
		return false;
		
	}
	
	

}
