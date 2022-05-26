package dao;

import java.sql.Statement;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import com.mysql.cj.xdevapi.JsonArray;

import dto.Category;
import dto.Order;
import dto.Porderdetail;
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
	
	public boolean saveorder(Order order) {
		String sql = "INSERT INTO porder(ordername, orderphone, orderaddress, ordertotalpay, orderrequest, mno) VALUES(?, ?, ?, ?, ?, ?)";
		try {
			ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, order.getOrdername());
			ps.setString(2, order.getOrderphone());
			ps.setString(3, order.getOrderaddress());
			ps.setInt(4, order.getOrdertotalpay());
			ps.setString(5, order.getOrderrequest());
			ps.setInt(6, order.getMno());
			ps.executeUpdate();
			rs = ps.getGeneratedKeys();
			if (rs.next()) {
				int pk = rs.getInt(1);
				System.out.println(pk);
				sql = "INSERT INTO porderdetail(samount, totalprice, orderno, sno) " + "SELECT samount, totalprice, " + pk + ", sno FROM cart WHERE mno = " + order.getMno();
				System.out.println(sql);
				ps = con.prepareStatement(sql);
				ps.executeUpdate();
				sql = "DELETE FROM cart WHERE mno = " + order.getMno();
				System.out.println(sql);
				ps = con.prepareStatement(sql);
				ps.executeUpdate();
			}
		} catch (Exception e) {
			System.err.println("saveorder error : " + e);
		}
		
		return false;
	}
	
	public JSONArray getchart(int type, int value) {
		
		String sql= "";
		JSONArray ja = new JSONArray();
		
		if (type == 1) {
			sql = "SELECT SUBSTRING_INDEX(orderdate, ' ', 1) AS 날짜, SUM(ordertotalpay) FROM porder GROUP BY 날짜 ORDER BY 날짜 DESC";
		} else if (type == 2) {
			sql = "SELECT SUM(A.samount), D.cname FROM porderdetail A, stock B, product C, category D WHERE A.sno = B.sno AND B.pno = C.pno AND C.cno = D.cno GROUP BY D.cname ORDER BY orderdetailno desc";
		} else if (type == 3) {
			sql = "SELECT SUBSTRING_INDEX(A.orderdate, ' ', 1) as 날짜, SUM(B.samount) as 총판매수량 FROM porder A, Porderdetail B, stock C WHERE A.orderno = B.orderno AND B.sno = C.sno and C.pno = (SELECT pno FROM stock WHERE sno = " + value + " ) GROUP BY 날짜 ORDER BY 날짜 DESC";
		}
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				JSONObject jo = new JSONObject();
				
				if (type == 1 || type == 3) {
					jo.put("date", rs.getString(1));
					jo.put("value", rs.getInt(2));
					ja.put(jo);
					System.out.println(jo.toString());
				} else if (type == 2) {
					jo.put("value", rs.getInt(1));
					jo.put("category", rs.getString(2));
					ja.put(jo);
				}
				
			}
			
			return ja;
		} catch (Exception e) {
			System.out.println("getchart error : " + e);
		}
		return null;
	}
	
	public ArrayList<Porderdetail> getorderdetail(){
		String sql = "SELECT A.* , SUBSTRING_INDEX(B.orderdate, ' ', 1) AS 날짜 FROM porderdetail A, porder B WHERE A.orderno = B.orderno AND SUBSTRING_INDEX(B.orderdate, ' ', 1) = SUBSTRING_INDEX(NOW(), ' ', 1) AND A.orderdetailactive = 3";
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			ArrayList<Porderdetail> list = new ArrayList<Porderdetail>();
			while (rs.next()) {
				Porderdetail orderdetail = new Porderdetail();
				orderdetail.setOrderdetailno(rs.getInt(1));
				orderdetail.setOrderdetailactive(rs.getInt(2));
				orderdetail.setSamout(rs.getInt(3));
				orderdetail.setTotalprice(rs.getInt(4));
				orderdetail.setOrderno(rs.getInt(5));
				orderdetail.setSno(rs.getInt(6));
				list.add(orderdetail);	
			}
			return list;
		} catch (Exception e) {
			System.out.println("getorderdetail error : " + e);
		}
		return null;
	}

}
