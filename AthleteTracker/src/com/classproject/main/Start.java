package com.classproject.main;


import com.classproject.GUI.GUIStart;
import com.classproject.athletes.BandMember;
import com.classproject.athletes.SCAELMember;

public class Start {

	public static void main(String args[])
	{
		System.out.println("started");
		new GUIStart();
		new SCAELMember().setCanPlay(false);
		 //Runs the GUI start program in the GUI package
	}
}
