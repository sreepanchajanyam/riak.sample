package riak.util;

public class GameSession {
	
	private int totalNoGamesPlayed;
	private int totalHandsPlayed;
	private float amountOnTable;
	
	public int getTotalNoGamesPlayed() {
		return totalNoGamesPlayed;
	}
	public void setTotalNoGamesPlayed(int totalNoGamesPlayed) {
		this.totalNoGamesPlayed = totalNoGamesPlayed;
	}
	public int getTotalHandsPlayed() {
		return totalHandsPlayed;
	}
	public void setTotalHandsPlayed(int totalHandsPlayed) {
		this.totalHandsPlayed = totalHandsPlayed;
	}
	public float getAmountOnTable() {
		return amountOnTable;
	}
	public void setAmountOnTable(float amountOnTable) {
		this.amountOnTable = amountOnTable;
	}
	@Override
	public String toString() {
		return "GameSession [totalNoGamesPlayed=" + totalNoGamesPlayed
				+ ", totalHandsPlayed=" + totalHandsPlayed + ", amountOnTable="
				+ amountOnTable + "]";
	}
	
	
}
