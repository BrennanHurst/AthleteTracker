package com.classproject.GUI;

import javax.swing.JFrame;

import com.classproject.GUI.components.StartComponent;

public class GUIStart extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 17431885152713844L;

	public GUIStart()
	{
		System.out.println("opened");
		this.setLayout(null);		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(0, 0, 500, 500);
		this.addComponentsOnStart();
	}
	
	/**
	 * instantiates and adds the components to the window on startup
	 */
	public void addComponentsOnStart()
	{
		this.add(new StartComponent());
	}

	
	
	
	
}
