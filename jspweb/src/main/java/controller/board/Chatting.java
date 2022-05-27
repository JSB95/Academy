package controller.board;

import java.util.Hashtable;

import java.util.Map;



import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.json.JSONArray;

import org.json.JSONObject;

// @WebServlet : URL 매핑
// @WebServlet(" HTTP 클래스내로 들어오는 경로 정의");
// @ServerEndpoint("서버소켓 클래스로 들어오는 경로 정의")
@ServerEndpoint("/chatting/{mid}")
public class Chatting {	// 서버소켓 사용할 클래스 
	
	public static Map<Session, String> clients = new Hashtable<>();

	// 1. 소켓 오픈
	@OnOpen
	public void OnOpen( Session session ,@PathParam("mid") String mid) {
		
		clients.put(session,mid);
		
		try {
			JSONArray jsonArray = new JSONArray();
			for (Session s : clients.keySet()) {
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("mid", clients.get(s));
				jsonArray.put(jsonObject);
			}
			
			for (Session s : clients.keySet()) {
				s.getBasicRemote().sendText(jsonArray.toString());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	// 2. 소켓 닫기 
	@OnClose
	public void OnClose(Session session) {
		clients.remove(session);
		
		try {
			JSONArray array = new JSONArray();
			
			for (Session s : clients.keySet()) {
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("type", "2");
				jsonObject.put("mid", clients.get(s));
				array.put(jsonObject);
			}
			
			for (Session s : clients.keySet()) {
				s.getBasicRemote().sendText(array.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 3. 소켓 메시지 보내기 
	@OnMessage
	public void OnMessage(String msg, Session session) throws Exception{
		
		
		for (Session s : clients.keySet()) {
			s.getBasicRemote().sendText(msg);
		}
	}
}