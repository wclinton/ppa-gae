package com.ppa8ball;

import java.util.ArrayList;
import java.util.List;

import com.ppa8ball.stats.PlayerStat;
import com.ppa8ball.stats.TeamStat;

public class TeamRoster {

	public Player[] players = new Player[5];
	public String name;
	public int number;
	
	public TeamRoster()
	{
		
	}
	
	public TeamRoster(TeamStat teamStat)
	{
		this(teamStat, new ArrayList<PlayerStat>());
	}
	
	public TeamRoster(TeamStat teamStat, List<PlayerStat> playerStats)
	{
		this.name = teamStat.name;
		this.number = teamStat.number;
		
		int i=0;
		for (PlayerStat playerStat : playerStats) {
			players[i++] = new Player(playerStat);
		}
	}
}
