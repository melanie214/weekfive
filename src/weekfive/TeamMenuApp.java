package weekfive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamMenuApp {
	
	static Scanner scanner = new Scanner(System.in);
	static List<team> teams = new ArrayList<team>();


	public static void main(String[] args) {
		
		
	 int decision = 0; 
	 
	 while (true) { 
		 printOptions(); 
		 decision = scanner.nextInt();
		 if (decision == 1) {
			 teams.add(createNewTeam()); 
		 	} else if (decision == 2) {
		 	  addPlayerToTeam();
		 	} else if (decision == 3) {
		 	  removePlayerFromTeam();
		 	} else if (decision == 4);
		      describeTeam();
	 		} else { 
			System.out.println("Please Pick a Valid Option!"); 
		      
	 		
	 		}
 		     
		 
	 	}

	




		private static void printOptions() {
			System.out.println("1) Create New Team");
			System.out.println("2) Add New Player To Team");
			System.out.println("3) Remove Player From Team");
			System.out.println("4) View Team Info");
			
		}
		
		private static void describeTeam() {
			printTeamNames();
			System.out.print("Which team would you like to see info for? ");
			String teamName = scanner.next();
			try {
			team foundTeam = findTeambyName(teamName);
			foundTeam.describe();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		
		private static team createNewTeam() {
			System.out.println("Enter name of team you want to create: ");
			String name = scanner.next();
			return new team(name);
			
		}
		
		private static void addPlayerToTeam() {
			printTeamNames();
			System.out.println("Enter the name of the team you wish to add a player to:");
			String teamName = scanner.next();
			try {
				team foundTeam = findTeambyName(teamName);
				foundTeam.addPlayer(createNewPlayer());
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
		}
		
		private static void removePlayerFromTeam() {
			printTeamNames();
			System.out.println("Enter the name of the team you wish to remove player from:");
			String teamName = scanner.next();
			try {
				team foundTeam = findTeambyName(teamName);
				foundTeam.describe();
				System.out.print("Which player would you like to remove? ");
				String playerName = scanner.next();
				foundTeam.removePlayer(playerName);
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
			
			}
		
			
		
		
		
		
		 private static player createNewPlayer () {
			System.out.print("Enter player name: ");
			String name = scanner.next();
			System.out.print("Enter player position: ");
			String position = scanner.next();
			System.out.print("Enter player speciality: ");
			String speciality = scanner.next();
			return new player(name, position, speciality);
			
		 }
		
		
		private static void printTeamNames() {
			for (team team : teams) {
				System.out.println(team.getName());
			}
		}
		
		
		
		private static team findTeambyName(String name) throws Exception {
			for (team team : teams) {
				if (team.getName().equals(name)) {
					return team;
				}
			}
		
		throw new Exception("Team Not Found: " + name);
		
		}
		
		
		
		
		
		
		
		
		
}