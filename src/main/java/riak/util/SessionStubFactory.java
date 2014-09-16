package riak.util;

import java.util.Random;

import org.apache.commons.codec.binary.Base64;

public class SessionStubFactory {
	private static Random rnd = new Random();
	
	public static MyWebSession getMyWebSessionStub() {
			return createMyWebSession();
	}

	private static MyWebSession createMyWebSession() {
		MyWebSession webSession = new MyWebSession(
				Base64.encodeBase64String("readablesessionid".getBytes()),
				Base64.encodeBase64String("This is a secret auth key"
						.getBytes()), "whoami777");
		webSession.getMap().put(
				GameType.BLACKJACK.toString() + System.currentTimeMillis(),
				getGameSessionRndData());
		webSession.getMap().put(
				GameType.ROULETTE.toString() + System.currentTimeMillis(),
				getGameSessionRndData());
		return webSession;
	}
	
	private static GameSession getGameSessionRndData(){
		GameSession tempSession = new GameSession();
		tempSession.setAmountOnTable(rnd.nextInt(100) + 1);
		tempSession.setTotalHandsPlayed(rnd.nextInt(20) +1);
		tempSession.setTotalNoGamesPlayed(rnd.nextInt(10)+1);
		
		return tempSession;
	}
	
	private static GameSession getGameSession(int amountOnTable, int totalhandsPlayed, int totalNoGamesPlayed){ 
		GameSession tempSession = new GameSession();
		tempSession.setAmountOnTable(amountOnTable);
		tempSession.setTotalHandsPlayed(totalhandsPlayed);
		tempSession.setTotalNoGamesPlayed(totalNoGamesPlayed);
		
		return tempSession;
	}
}
