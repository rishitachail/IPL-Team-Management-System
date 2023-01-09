package ipl;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Tournament t = new Tournament();
		System.out.println("Enter tournamant name: ");
		t.setTournamentName(scan.next());
		System.out.println("Enter year: ");
		t.setYear(scan.nextInt());
		
		int choice;
		do {
			System.out.println("Enter 1--> Add Team 2--> Display Team 3--> Exit");
			choice = scan.nextInt();
			switch(choice) {
			case 1: t.addTeam();
			        break;
			case 2: t.displayTournament();
			        break;
			case 3: break;
			
			}
			
		}
		while(choice != 3);
		
		

	}

}
