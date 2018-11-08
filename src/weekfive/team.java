package weekfive;

import java.util.ArrayList;
import java.util.List;

public class team {
	
	private List<player> players = new ArrayList<player>();
	private String name; 
	
	public team(String name) {
		this.setName(name); 
	}
	
	public void describe() {
		System.out.println("Team Name: " + name);
		for (player player : players) {
			player.describe();
		}
	}
	
	
	public void addPlayer(player player) {
		players.add(player); 
	}
	
	
	public void removePlayer(String playerName) {
		for (player player : players) {
			if (player.getName().equals(playerName)) {
				players.remove(player);
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}


