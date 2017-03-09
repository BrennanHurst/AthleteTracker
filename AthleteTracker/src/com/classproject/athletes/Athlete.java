package com.classproject.athletes;

public abstract class Athlete 
{
	private int age;
	private char gender;
	private boolean canPlay;
	private int studentNumber;
	
	public Athlete(int a, char g, int n)
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
	
	public char getGender()
	{
		return gender;
	}
	
	public void setGender(char g)
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
	
	abstract boolean getCanPlay();
	// implement
	
	abstract void setCanPlay();
	
	public String toString()
	{
		return "" + this.getAge() + this.getGender() + this.getCanPlay();
	}
}
