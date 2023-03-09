package com.raisoni.adityabhandari.se.ems;

import com.raisoni.adityabhandari.se.ems.controller.EMSController;

public class MainApp {

	public static void main(String[] args)
	{
		//Bootstrapping
		
		EMSController emsController = new EMSController();
		emsController.appStart();

	}

}
