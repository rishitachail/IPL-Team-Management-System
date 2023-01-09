package ipl;

import java.util.*;

public class Team {
	
	private String teamName;
	private String ceo;
	private Player[] player= new Player[20];
	private int playerCounter;
	
	public Team() {
		playerCounter = 0;
	}

	public Team(String teamName, String ceo) {
		this.teamName = teamName;
		this.ceo = ceo;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCeo() {
		return ceo;
	}
	
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	
	int choice;
	public void addPlayers() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter choice 1 for Batsman");
		System.out.println("Enter choice 2 for Bowler");
		System.out.println("Enter choice 3 for Wicket-Keeper");
		System.out.println("Enter your choice");
		
		choice = scan.nextInt();
		if(choice == 1) {
			player[playerCounter] = new Batsman();
			player[playerCounter].read();
		}
		else if(choice ==2) {
			player[playerCounter] = new Bowler();
			player[playerCounter].read();
		}
		else if(choice ==3) {
			player[playerCounter] = new Wicket_Keeper();
			player[playerCounter].read();
		}
		else {
			System.out.println("Enter a valid choice");
		}
		playerCounter++;
		
	}
	
	public void displayTeam() {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter teamName: ");
//		teamName = scan.next();
//		System.out.println("Enter ceo: ");
//		ceo = scan.next();
		System.out.println("Team name: " + teamName);
		System.out.println("Ceo: " + ceo);
		for(int i=0 ; i< playerCounter ; i++) {
			System.out.println(player[i]);
			
		}
		
	}
	
}
