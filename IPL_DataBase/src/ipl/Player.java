package ipl;

import java.util.*;

public abstract class Player {
	private int playerId;
	private String playerName;
	
	public Player() {
		
	}

	public Player(int playerId, String playerName) {
		this.playerId = playerId;
		this.playerName = playerName;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		if(playerId <=0)
			System.out.println("Enter valid playerId");
		else
		    this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		if(playerName.length() < 1)
			System.out.println("Enter valid playerName");
		else
		    this.playerName = playerName;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + "]";
	}
	
	public void read() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter playerId: ");
		playerId = scan.nextInt();
		System.out.println("Enter playerName: ");
		playerName = scan.next();
		
	}
	
	
}
