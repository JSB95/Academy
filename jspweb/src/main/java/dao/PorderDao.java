package dao;

import org.json.JSONArray;
import org.json.JSONObject;

public class PorderDao extends Dao{
	
	public static PorderDao porderDao = new PorderDao();
	
	public static PorderDao getPorderDao() {
		return porderDao;
	}
	
	public JSONArray getorder(int mno) {
		
		String sql = "SELECT "
				+ "	A.orderno as 주문번호 , "
				+ "    A.orderdate as 주문일 , "
				+ "    B.orderdetailno as 주문상세번호 , "
				+ "    B.orderdetailactive as 주문상세상태 , "
				+ "    B.samount as 주문상세수량 , "
				+ "    C.sno as 재고번호 , "
				+ "    C.scolor as 색상 , "
				+ "    C.ssize as 사이즈 , "
				+ "    D.pno as 제품번호 , "
				+ "    D.pname as 제품명 ,"
				+ "    D.pimg as 제품사진 "
				+ "FROM "
				+ "porder A JOIN porderdetail B on A.orderno = B.orderno "
				+ "JOIN STOCK C on B.sno = C.sno "
				+ "JOIN product D ON C.pno = D.pno where A.mno = "+mno+" order by A.orderno desc;";
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			JSONArray parentArray = new JSONArray();
			
			JSONArray childArray = new JSONArray();
			
			int oldordeno = -1;
			
			while(rs.next()) {
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("orderno", rs.getInt(1));
				jsonObject.put("orderdate", rs.getString(2));
				jsonObject.put("orderdetailno", rs.getInt(3));
				jsonObject.put("orderdetailactive", rs.getInt(4));
				jsonObject.put("samount", rs.getInt(5));
				jsonObject.put("sno", rs.getInt(6));
				jsonObject.put("scolor", rs.getString(7));
				jsonObject.put("ssize", rs.getString(8));
				jsonObject.put("pno", rs.getInt(9));
				jsonObject.put("pname", rs.getString(10));
				jsonObject.put("pimg", rs.getString(11));
				
				if(oldordeno == rs.getInt(1)) {
					childArray.put(jsonObject);
				} else {
					childArray = new JSONArray();
					childArray.put(jsonObject);
					parentArray.put(childArray);
				}
				
				oldordeno = rs.getInt(1);
				
			}
			return parentArray;
		} catch (Exception e) {
			System.err.println("getorder error : " + e);
		}
		
		return null;
	}

}
