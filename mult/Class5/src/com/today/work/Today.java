package com.today.work;

import java.util.Scanner;

public class Today {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char [] helloarray = {'h','e','l','l','o','.'};
        String hellostring =new String(helloarray);
        System.out.println(hellostring);
        
        String x="hello";
        System.out.println(x.compareTo("hello"));
        String y= "HELLO";
        System.out.println(y.compareToIgnoreCase(y));
        System.out.println(x.endsWith("o"));
        System.out.println(x.equals(y));
        System.out.println(x.indexOf('l'));
        System.out.println(x.lastIndexOf('l'));
        System.out.println(x.replace('l', 't'));
        String [] z= x.split("l");
        System.out.println(z[0]);
        System.out.println(x.startsWith("he"));
        System.out.println(x.charAt(0));
    	
	}
	
     

}
