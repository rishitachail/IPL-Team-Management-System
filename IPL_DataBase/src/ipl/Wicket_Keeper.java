package ipl;

import java.util.*;

public class Wicket_Keeper extends Batsman{
	
	private int stump;
	private int catches;
	
	public Wicket_Keeper() {
		super();
	}

	public Wicket_Keeper(int playerId, String playerName, int runs, int hundreds, int fifties, int stump, int catches) {
		super(playerId, playerName, runs, hundreds, fifties);
		this.stump = stump;
		this.catches = catches;
	}

	public int getStump() {
		return stump;
	}

	public void setStump(int stump) {
		if(stump < 0)
			System.out.println("Invalid number");
		else
		    this.stump = stump;
	}

	public int getCatches() {
		return catches;
	}

	public void setCatches(int catches) {
		if(catches < 0)
			System.out.println("Invalid number");
		else
		    this.catches = catches;
	}

	@Override
	public String toString() {
		return super.toString() + "Wicket_Keeper [stump=" + stump + ", catches=" + catches + "]";
	}
	
	public void read() {
		Scanner scan = new Scanner(System.in);
		super.read();
		System.out.println("Enter no. of stumps: ");
		stump = scan.nextInt();
		System.out.println("Enter no. of catches: ");
		catches = scan.nextInt();
		
	}
	
	
	
	
	
	

}
