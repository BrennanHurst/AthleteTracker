package com.classproject.math;

import java.util.ArrayList;

import com.classproject.athletes.Athlete;
import com.classproject.athletes.BandMember;
import com.classproject.athletes.SCAELMember;

public class AthleteHandler {

	private static ArrayList <Athlete> athletes = new ArrayList<Athlete>();

	/**
	 * adds an athlete to the database
	 * @param a
	 */
	public static void addAthlete(Athlete a)
	{
		athletes.add(a);
	}
	
	/**
	 * returns all the athletes of one specific class
	 * @param c
	 * @return
	 */
	public static ArrayList<Athlete> getAthletesFromClass(Class<?> c)
	{
		ArrayList <Athlete> athletesUpdated = new ArrayList<Athlete>();
		for(Athlete a : athletes)
		{
			if(a.getClass().equals(c))
			{
				athletesUpdated.add(a);
			}
		}
		return athletesUpdated;
	}
	/**
	 * Sets the athletes list, should only be called on startup while reading in data from files. 
	 * @param athleteList
	 */
	public static void setAthletes(ArrayList<Athlete> athleteList)
	{
		athletes = athleteList;
	}
	
}
