package com.oop.cls;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner input =new Scanner(System.in);
		String m= input.nextLine();
		float u=input.nextFloat();
		int l=input.nextInt();
		Invoice obj= new Invoice (m,u,l);
		double total= obj.total();
		System.out.println(total);
	}

}
