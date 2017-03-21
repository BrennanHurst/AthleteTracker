package com.classproject.athletes;

public abstract class Athlete 
{
	private int age;
	private String gender;
	private boolean canPlay;
	private String studentNumber;
	
	public Athlete(int a, String g, String n)
	{
		this.age = a;
		this.gender = g;
		this.studentNumber = n;
		
	}
	
	public Athlete()
	{
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public void setAge(int a)
	{
		this.age = a;
	}
	
	public String getGender()
	{
		return this.gender;
	}
	
	public void setGender(String g)
	{
		this.gender = g;
	}
	
	public String getStudentNumber()
	{
		return this.studentNumber;
	}
	
	public void setStudentNumber(String n)
	{
		this.studentNumber = n;
	}
	
	public boolean getCanPlay()
	{
		return this.canPlay;
	}
	
	public void setCanPlay(boolean c)
	{
		this.canPlay = c;
	}
	
	public String toString()
	{
		return "" + this.getAge() + this.getGender() + this.getCanPlay();
	}
}