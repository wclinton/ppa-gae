package com.ppa8ball.schedule.service;

import com.ppa8ball.schedule.Week;
import com.ppa8ball.schedule.Weeks;

public interface WeekService
{
	public Weeks GetAll();
	public void Save(Week week);
	public void Save(Iterable<Week> weeks);
	
	public void DeleteAll();
}
