package com.manager.purchase;

public class Manager{

	 Iworker w;
	
	public void setworker(Iworker w) {
		// TODO Auto-generated method stub
		this.w=w;
	}
	public void Manager() {
		// TODO Auto-generated method stub
		w.work();
	}
     
}
