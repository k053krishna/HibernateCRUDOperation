package com.defailtmethod;

public class Mobile  {

	public void insertSim(Sim sim) {
	    sim.call();
		sim.sms();
		sim.videoCall();
	}
}
