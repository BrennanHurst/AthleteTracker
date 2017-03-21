package com.classproject.athletes;

public class SCAELMember extends Athlete{

	private int bob = 0;
	
	public SCAELMember()
	{
		super();
	}
	public SCAELMember(int age, String gender)
	{
		super();
		this.setAge(age);
		this.setGender(gender);
	}
	public void setbob(int bob)
	{
		this.bob = bob;
	}
	public int getbob()
	{
		return this.bob;
	}
	
	public void setCanPlay() {
		boolean f = false;
		super.setCanPlay(f);
		
	}
	
	
	
}
