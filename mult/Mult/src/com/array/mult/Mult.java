package com.array.mult;

import java.util.Scanner;

public class Mult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input=new Scanner(System.in);
       int n,m,i,j,k;
       n=input.nextInt();
       m=input.nextInt();
     int a[][]= new int [n][m];
     int b[][]= new int [n][m];
     int c[][]= new int [n][m];
     
     for(i=0;i<a.length;i++)
     {
    	 for(j=0;j<a[i].length;j++){
    		 
    	 
    	 a[i][j]= input.nextInt();
    	 }
     }
     for(i=0;i<b.length;i++)
     {
    	 for(j=0;j<b[i].length;j++){
    		 
    	 
    	 b[i][j]= input.nextInt();
    	 }
     }
     for(i=0;i<c.length;i++)
     {
    	 for(j=0;j<c[i].length;j++){
    		 
    	 
    	 c[i][j]= 0;
    	 }
     }
     for(i=0;i<a.length;i++)
     {
    	 for(j=0;j<a[i].length;j++){
    		for(k=0;k<a[i].length;k++) 
    	 
    		 c[i][j]+= a[i][k]* b[k][j];
    	 }
     }
     for(i=0;i<c.length;i++)
     {
    	 for(j=0;j<c[i].length;j++){
    		 
    	 
    	 System.out.print(c[i][j]+" ");
    	 }
    	 System.out.println();
     }
    


	   
	}

}
