package com.invertory.purchase;

import java.util.Scanner;

public class Man {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner input = new Scanner(System.in);
		  
           System.out.println("enter two number");
           int a=input.nextInt(),b=input.nextInt(),c,d;
           c=a+b;
           d=a-b;
           System.out.println("sum ="+a+b*10);
	}

}
