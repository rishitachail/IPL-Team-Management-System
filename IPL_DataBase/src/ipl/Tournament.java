package ipl;

import java.util.*;

public class Tournament {
	
	private String tournamentName;
	private int year;
	private Team[] team = new Team[10];
	private int teamCounter;
	
	public Tournament() {
		teamCounter = 0;
	}

	public Tournament(String tournamentName, int year) {
		//super();
		this.tournamentName = tournamentName;
		this.year = year;
	}

	public String getTournamentName() {
		return tournamentName;
	}

	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void addTeam() {
		Scanner scan = new Scanner(System.in);
		team[teamCounter] = new Team();
		System.out.println("Enter teamName: ");
		team[teamCounter].setTeamName(scan.next());
		System.out.println("Enter ceo: ");
		team[teamCounter].setCeo(scan.next());
		System.out.println("Enter number of players: ");
		int nop = scan.nextInt();
		for(int i= 0; i< nop;i++) {
			team[teamCounter].addPlayers();
		}
		teamCounter++;
		
	}
	
	public void displayTournament() {
		System.out.println("Tournament name: " + tournamentName);
		System.out.println("Year: " + year);
		for(int i=0;i< teamCounter; i++) {
			team[i].displayTeam();
		}
	}
	
	

}
