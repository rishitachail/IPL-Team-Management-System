package ipl;

import java.util.*;

public class Bowler extends Batsman{
	
	private int overs;
	private int wickets;
	
	public Bowler() {
		super();
	}

	public Bowler(int playerId, String playerName, int runs, int hundreds, int fifties, int overs, int wickets) {
		super(playerId, playerName, runs, hundreds, fifties);
		this.overs = overs;
		this.wickets = wickets;
	}

	public int getOvers() {
		return overs;
	}

	public void setOvers(int overs) {
		if(overs < 0)
			System.out.println("Invalid number");
		else
		    this.overs = overs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		if(wickets < 0)
			System.out.println("Invalid number");
		else
		    this.wickets = wickets;
	}

	@Override
	public String toString() {
		return super.toString() + "Bowler [overs=" + overs + ", wickets=" + wickets + "]";
	}
	
	public void read() {
		Scanner scan = new Scanner(System.in);
		super.read();
		System.out.println("Enter number of overs played: ");
		overs = scan.nextInt();
		System.out.println("Enter number of wickets taken: ");
		wickets = scan.nextInt();
		
	}

	
	
	
	
	

}
