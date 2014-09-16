package riak.util;

import java.util.HashMap;
import java.util.Map;

public class MyWebSession {
	private final String sessionID;
	private final String encoAuthKey;
	private final String userID;
	private final Map<String, GameSession> gameIDvsGameSession = new HashMap<String, GameSession>();
	
	
	public MyWebSession() {
		this.sessionID = "default";
		this.encoAuthKey = "default";
		this.userID = "default";
	}
	public MyWebSession(String sessionID, String encoAuthKey, String userID) {
		
		this.sessionID = sessionID;
		this.encoAuthKey = encoAuthKey;
		this.userID = userID;
	}
	public Map<String, GameSession> getMap() {
		return gameIDvsGameSession;
	}
	@Override
	public String toString() {
		return "MyWebSession [sessionID=" + sessionID + ", encoAuthKey="
				+ encoAuthKey + ", userID=" + userID + ", map=" + gameIDvsGameSession + "]";
	}
	public String getSessionID() {
		return sessionID;
	}
	public String getEncoAuthKey() {
		return encoAuthKey;
	}
	public String getUserID() {
		return userID;
	}
	
	
	
}
