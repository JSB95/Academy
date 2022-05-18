package dao;

import java.util.ArrayList;

import dto.Category;
import dto.Product;
import dto.Stock;

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
		
		String sql = "SELECT * FROM product";
		
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
	
	public Product getproduct(int pno) {
		String sql = "SELECT * FROM product WHERE pno=" + pno;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				Product product = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getFloat(4), rs.getInt(5), rs.getString(6), rs.getInt(7));
				return product;
			}
		} catch (Exception e) {
			System.err.println("getproductlist error : " + e);
		}
		return null;
	}
	
	public boolean activechange(int pno, int active) {
		String sql = "UPDATE product set pactive =" + active + " WHERE pno=" + pno;
		try {
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.err.println("activechange error : " + e);
		}
		return false;
	}
	
	public boolean ssave(Stock stock) {
		String sql = "INSERT INTO stock(scolor, ssize, samount, pno) VALUES (?, ?, ?, ?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, stock.getScolor());
			ps.setString(2, stock.getSsize());
			ps.setInt(3, stock.getSamount());
			ps.setInt(4, stock.getPno());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.err.println("ssave error: " + e);
		}
		return false;
	}
	
	public ArrayList<Stock> getStock(int pno){
		ArrayList<Stock> list = new ArrayList<Stock>();
		String sql = "SELECT * FROM stock WHERE pno=" + pno;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Stock stock = new Stock(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getInt(7));
				list.add(stock);
			}
			return list;
		} catch (Exception e) {
			System.err.println("getstock error : " + e);
		}
		
		return null;
	}
	
	public boolean stockupdate( int sno , int samount ) {
		String sql = "UPDATE stock SET samount = "+ samount +" WHERE sno=" + sno;
		try {
			ps = con.prepareStatement(sql);
			ps.executeUpdate(); 
			return true;
		}catch (Exception e) { 
			System.err.println("stockupdate error : " + e); 
		} 
		return false;

	}
	
	public int saveplike(int pno, int mno) {
		try {
			String sql = "SELECT plikeno FROM plike WHERE pno=" + pno + " AND mno=" + mno;
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				sql = "DELETE FROM plike WHERE plikeno = " + rs.getInt(1);
				ps = con.prepareStatement(sql);
				ps.executeUpdate();
				return 2;
			} else {
				sql = "INSERT INTO plike(pno, mno) VALUES(" + pno + "," + mno + ")";
				ps = con.prepareStatement(sql);
				ps.executeUpdate();
				return 1;
			}
		} catch (Exception e) {
			System.err.println("saveplike error : " + e);
		} 
		
		
		return 0;
	}
	
	public boolean getplike(int pno, int mno) {
		String sql = "SELECT * FROM plike WHERE pno=" + pno + " AND mno=" + mno;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			System.err.println("getplike error : " + e);
		}
		
		return false;
	}

}
