package com.classproject.main;


import com.classproject.GUI.GUIStart;
import com.classproject.athletes.BandMember;
import com.classproject.athletes.SCAELMember;
import com.classproject.math.AthleteHandler;

public class Start {

	public static void main(String args[])
	{
		System.out.println(new BandMember().getClass());
		new GUIStart();
		new SCAELMember().setCanPlay(false);
		AthleteHandler.addAthlete(new BandMember());
		AthleteHandler.addAthlete(new SCAELMember());
		System.out.println(AthleteHandler.getAthletesFromClass(com.classproject.athletes.SCAELMember.class));
		
		 //Runs the GUI start program in the GUI package
		
	}
}
