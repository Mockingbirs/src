package com.springproj.ex01;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LgTV lgTv;  //SSTV ssTv;
		lgTv = new LgTV();  // lgTv=new SSTV;
		
		lgTv.turnOn();
		
		lgTv.soundUp();
		
		lgTv.soundOff();
		
		lgTv.turnOff();
		
		
		SSTV ssTv = new SSTV();
		
		ssTv.powerOn();
		ssTv.volumeUp();
		ssTv.volumeDown();
		ssTv.powerOff();
		
	}

}
