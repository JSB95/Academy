package dao;

import java.util.ArrayList;

import dto.Category;
import dto.Product;

public class ProductDao extends Dao {
	
	public ProductDao() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public static ProductDao productDao = new ProductDao();
	
	public static ProductDao getProductDao() {
		return productDao;
	}
	
	public boolean csave(String cname) {
		
		String sql = "INSERT INTO category(cname) VALUES('" + cname + "')";
		
		try {
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.err.println("csave error : " + e);
		}
		
		return false;
	}
	
	public ArrayList<Category> getcategorylist(){
		
		ArrayList<Category> categorylist = new ArrayList<Category>();
		
		String sql = "SELECT * FROM category ORDER BY cno";
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Category category = new Category(rs.getInt(1), rs.getString(2));
				categorylist.add(category);
			}
			return categorylist;
		} catch (Exception e) {
			System.err.println("getcategorylist error : " + e);
		}
		
		return null;
	}
	
	public boolean psave(Product product) {
		String sql = "INSERT INTO product(pname, pprice, pdiscount, pimg, cno) VALUES(?, ?, ?, ?, ?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, product.getPname());
			ps.setInt(2, product.getPprice());
			ps.setFloat(3, product.getPdiscount());
			ps.setString(4, product.getPimg());
			ps.setInt(5, product.getCno());
			System.out.println(product.getPno());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.err.println("psave error : " + e);
		}
		
		return false;
	}
	
	public ArrayList<Product> getproductlist (){
		ArrayList<Product> getproudctlist = new ArrayList<Product>();
		
		String sql = "SELECT * FROM product ORDER BY pno";
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Product product = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getFloat(4), rs.getInt(5), rs.getString(6), rs.getInt(7));
				getproudctlist.add(product);
			}
			return getproudctlist;
		} catch (Exception e) {
			System.err.println("getproductlist error : " + e);
		}
		return null;
	}
	
	public int getproductpno() {
		String sql = "SELECT pno FROM product";
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			}
		} catch (Exception e) {
			System.err.println("getproductpno error : " + e);
		}
		
		return 0;
	}

}
