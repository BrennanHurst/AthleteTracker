package com.classproject.GUI.components;

import javax.swing.JPanel;

import com.classproject.GUI.GUIConstants;

@SuppressWarnings("serial")
public abstract class GUIComponent extends JPanel{


	public GUIComponent()
	{
		this.configureLayout();
		//////
	}
	
	
	/**
	 * Called at the start of this component, is used to set the layout of this component. 
	 */
	public void configureLayout(){
		this.setBounds(0, 0, GUIConstants.SCREENWIDTH, GUIConstants.SCREENHEIGHT);
	};
	
	
	
}
