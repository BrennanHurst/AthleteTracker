package com.classproject.athletes.copy;

public abstract class Athlete 
{
	private int age;
	private char gender;
	private boolean canPlay;
	
	public Athlete(int a, char g, boolean c)
	{
		age = a;
		gender = g;
		canPlay = c;
	}
	
	public Athlete()
	{
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	
	public char getGender()
	{
		return gender;
	}
	
	public void setGender(char g)
	{
		gender = g;
	}
	
	public boolean getCanPlay()
	{
		return canPlay;
	}
	
	public void setCanPlay(boolean c)
	{
		canPlay = c;
	}
	
	public String toString()
	{
		return "" + this.getAge() + this.getGender() + this.getCanPlay();
	}
}
