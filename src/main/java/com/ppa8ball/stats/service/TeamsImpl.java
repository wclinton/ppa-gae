package com.ppa8ball.stats.service;

import java.util.Collections;
import java.util.List;

import com.ppa8ball.OfyService;
import com.ppa8ball.stats.TeamStat;
import com.ppa8ball.stats.TeamsStat;

public class TeamsImpl implements TeamService
{
	public TeamsStat GetAll()
	{
		List<TeamStat> teams = getFromDB();

		if (teams.isEmpty())
		{
			PlayerServiceImpl.loadDb();
			teams = getFromDB();
		}
		return new TeamsStat(teams);
	}

	public TeamStat Get(int teamNumber)
	{
		return null;
	}

	private List<TeamStat> getFromDB()
	{
		List<TeamStat> teams = OfyService.myOfy().load().type(TeamStat.class).filter("isNormal", true).list();
		Collections.sort(teams);
		return teams;
	}
}