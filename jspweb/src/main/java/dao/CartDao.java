package dao;

import org.json.JSONArray;
import org.json.JSONObject;

import dto.Cart;

public class CartDao extends Dao {
	
	public static CartDao cartDao = new CartDao();
	
	public static CartDao getCartDao() {
		return cartDao; 
	}
	
	public boolean savecart(Cart cart) {
		
		
		try {
			String sql = "SELECT * FROM cart where sno = " + cart.getSno() + " AND mno = " + cart.getMno();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			if (rs.next()) {
				sql = "UPDATE cart SET samount = samount + " + cart.getSamount() + " , totalprice = totalprice + " + cart.getTotalprice() + " WHERE cartno = " + rs.getInt(1);
				ps = con.prepareStatement(sql);
				ps.executeUpdate();
				return true;
			} else {
				sql = "INSERT INTO cart(samount, totalprice, sno, mno) VALUES(?, ?, ?, ?)";
				ps = con.prepareStatement(sql);
				ps.setInt(1, cart.getSamount());
				ps.setInt(2, cart.getTotalprice());
				ps.setInt(3, cart.getSno());
				ps.setInt(4, cart.getMno());
				ps.executeUpdate();
				System.out.println(cart.getSno());
				return true;
			}
			
		} catch (Exception e) {
			System.err.println("savecart error : " + e);
		}
		return false;
	}
	
	public JSONArray getcart(int mno) {
		JSONArray jsonArray = new JSONArray();
		String sql = "SELECT A.cartno as 장바구니번호, A.samount as 구매수량, A.totalprice as 총가격, B.scolor as 색상, B.ssize as 사이즈, B.pno as 제품번호, C.pname as 제품명, C.pimg as 제품이미지 FROM cart A JOIN stock B on A.sno = B.sno JOIN product C on B.pno = C.pno WHERE A.mno = " + mno;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				JSONObject object = new JSONObject();
				object.put("cartno", rs.getInt(1));
				object.put("samount", rs.getInt(2));
				object.put("totalprice", rs.getInt(3));
				object.put("scolor", rs.getString(4));
				object.put("ssize", rs.getString(5));
				object.put("pno", rs.getInt(6));
				object.put("pname", rs.getString(7));
				object.put("pimg", rs.getString(8));
				jsonArray.put(object);
			}
			return jsonArray;
		} catch (Exception e) {
			System.err.println("getcart error : " + e);
		}
		return null;
	}
	
	public boolean updatecart(int cartno, int samount, int totalprice) {
		
		String sql = "UPDATE cart SET samount = " + samount +", totalprice = " + totalprice + " WHERE cartno = " + cartno;
		
		try {
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.err.println("updatecart error : " + e);
		}
		
		return false;
	}
	
	public boolean deletecart(int cartno) {
		
		String sql = "DELETE FROM cart WHERE cartno = " + cartno;
		
		try {
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.err.println("deletecart error : " + e);
		}
		
		return false;
	}

}
