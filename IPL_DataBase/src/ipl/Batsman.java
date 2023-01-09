package ipl;

import java.util.*;

public class Batsman extends Player{
	
	private int runs;
	private int hundreds;
	private int fifties;
	
	public Batsman() {
		super();
	}

	public Batsman(int playerId, String playerName, int runs, int hundreds, int fifties) {
		super(playerId, playerName);
		this.runs = runs;
		this.hundreds = hundreds;
		this.fifties = fifties;
	}


	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		if(runs < 0)
			System.out.println("Invalid number");
		else
		    this.runs = runs;
	}

	public int getHundreds() {
		return hundreds;
	}

	public void setHundreds(int hundreds) {
		if(hundreds < 0)
			System.out.println("Invalid number");
		else
		    this.hundreds = hundreds;
	}

	public int getFifties() {
		return fifties;
	}

	public void setFifties(int fifties) {
		if(fifties < 0)
			System.out.println("Invalid number");
		else
		    this.fifties = fifties;
	}

	@Override
	public String toString() {
		return super.toString() + "Batsman [runs=" + runs + ", hundreds=" + hundreds + ", fifties=" + fifties + "]";
	}
	
	public void read() {
		Scanner scan = new Scanner(System.in);
		super.read();
		System.out.println("Enter runs scored: ");
		runs = scan.nextInt();
		System.out.println("Enter no.of hundreds scored: ");
		hundreds = scan.nextInt();
		System.out.println("Enter no.of fifties scored: ");
		fifties = scan.nextInt();
		
		
	}
	
	
	
	

}
