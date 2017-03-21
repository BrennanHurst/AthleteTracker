package com.classproject.athletes;

import java.io.Serializable;
import java.util.ArrayList;

public class BandMember extends Athlete implements Serializable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7062734863858097657L;
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
	private double moneyNeeded;
	private boolean hasWonAudition;
	private int numUnexcusedAbsence;
	ArrayList<String> knownInstruments = new ArrayList<String>();
	
	public BandMember()
	{

		
	}
	public BandMember(int a, String g, String n)

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
	
	/**
	 * During implementation, you must use this method as the parameter of a print 
	 * statement.
	 * @param i is the instrument name
	 * @return list of known instruments after modification, and potentially an error message. All in
	 * one string.
	 */
	public String removeInstrument(String i)
	{
		if (knownInstruments.contains(i))
		{
			knownInstruments.remove(i);
			return knownInstruments.toString();
		}
		else 
		{
			
			return "The Instrument you entered is "
					+ "not in the list of known instruments, here is a list of known instruments "
					+ "/n" + knownInstruments.toString();
		}
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
	
	public void setCanPlay(boolean c)
	{
		super.setCanPlay(c);
	}
	
}