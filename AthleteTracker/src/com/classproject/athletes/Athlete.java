package com.classproject.athletes;

public abstract class Athlete 
{
	private int age;
	private String gender;
	private boolean canPlay;
	private int studentNumber;
	
	public Athlete(int a, String g, int n)
	{
		age = a;
		gender = g;
		studentNumber = n;
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
	
	public String getGender()
	{
		return gender;
	}
	
	public void setGender(String g)
	{
		gender = g;
	}
	
	public int getStudentNumber()
	{
		return studentNumber;
	}
	
	public void setStudentNumber(int n)
	{
		studentNumber = n;
	}
	
	public boolean getCanPlay()
	{
		return canPlay;
	}
	
	abstract void setCanPlay();
	
	public String toString()
	{
		return "" + this.getAge() + this.getGender() + this.getCanPlay();
	}
}