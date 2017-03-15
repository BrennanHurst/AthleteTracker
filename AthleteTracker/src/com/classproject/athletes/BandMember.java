package com.classproject.athletes;

import java.util.ArrayList;

public class BandMember extends Athlete
{
	private boolean isInSymphonic;
	private boolean isInConcert;
	private boolean isInFridayMarching;
	private boolean isInSaturdayMarching;
	private boolean isInIDL;
	private boolean isInWinterGaurd;
	private boolean isInFlagsGroup;
	private boolean isInJazzBand;
	private int districtScore;
	private double studentCredit;
	ArrayList<String> knownInstruments = new ArrayList<String>();
	
	public BandMember(int a, String g, int n)
	{
		setAge(a);
		setGender(g);
		setStudentNumber(n);
	}
	public boolean getSymphonic()
	{
		return isInSymphonic;
	}
	
	public void setSymphonic(boolean s)
	{
		isInSymphonic = s;
	}
	
	public boolean getConcert()
	{
		return isInConcert;
	}
	
	public void setConcert(boolean c)
	{
		isInConcert = c;
	}
	
	public boolean getFridayBand()
	{
		return isInFridayMarching;
	}
	
	public void setFridayBand(boolean f)
	{
		isInFridayMarching = f;
	}
	
	public boolean getSaturdayBand()
	{
		return isInSaturdayMarching;
	}
	
	public void setSaturdayBand(boolean s)
	{
		isInSaturdayMarching = s;
	}
	
	public boolean getIDL()
	{
		return isInIDL;
	}
	
	public void setIDL(boolean i)
	{
		isInIDL = i;
	}
	
	public boolean getWinterGaurd()
	{
		return isInWinterGaurd;
	}
	
	public void setWinterGaurd(boolean w)
	{
		isInWinterGaurd = w;
	}
	
	public boolean getFlagsGroup()
	{
		return isInFlagsGroup;
	}
	
	public void setFlagsGroup(boolean f)
	{
		isInFlagsGroup = f;
	}
	
	public int getDistrictScore()
	{
		return districtScore;
	}
	
	public void setDistrictScore(int s)
	{
		districtScore = s;
	}
	
	public void addInstrument(String s)
	{
		knownInstruments.add(s);
	}
	
	public boolean getJazzBand()
	{
		return isInJazzBand;
	}
	
	public void setJazzBand(boolean j)
	{
		isInJazzBand = j;
	}
	
	public ArrayList getInstruments()
	{
		return knownInstruments;
	}
	
	public void removeInstrument(int i)
	{
		knownInstruments.remove(i);
	}
	public void setCanPlay()
	{
	}
	
}
