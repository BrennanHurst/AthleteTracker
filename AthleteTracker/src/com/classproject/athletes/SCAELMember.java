package com.classproject.athletes;

public class SCAELMember extends Athlete{

	
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
	
	public void setCanPlay() {
		boolean f = false;
		super.setCanPlay(f);
		
	}
	
	
	
}
