package dao;

import java.util.ArrayList;

import dto.City;

public class CityDao extends Dao {
	
	public CityDao() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public static CityDao cityDao = new CityDao();
	
	public static CityDao getCityDao() {
		return cityDao;
	}
	
	public ArrayList<City> getcitylist(){
		ArrayList<City> citylist = new ArrayList<City>();
		String sql= "select * from citytest";
		
		try {
			
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				City city = new City(rs.getInt(1), rs.getString(2));
				citylist.add(city);
				
			}
			return citylist;
			
		} catch (Exception e) {
			System.err.println("getcitylist error : " + e);
		}
		return null;
	}
	
	

}
