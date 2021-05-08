package com.manager.purchase;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Iworker x=new Work();
		Manager m=new Manager();
		m.setworker(x);
		m.Manager();
		x=new parttime();
		m.setworker(x);
		m.Manager();
	}

}
