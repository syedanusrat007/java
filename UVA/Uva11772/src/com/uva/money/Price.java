package com.uva.money;

import java.util.Scanner;

public class Price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner input=new Scanner(System.in);
		int n,t,i,a,b,c;
		t=input.nextInt();
		
		for(i=1;i<=t;i++)
		{
			
			a=input.nextInt();
			b=input.nextInt();
			c=input.nextInt();
			
		    if(a>b && a<c || c<a && b>a)
				
			System.out.println("Case"+" "+i+" : "+a );
		    
		    else if(b>a && b<c || b<a && b>c)
				
				System.out.println("Case"+" "+i+" : "+b );
		    
		    else
				
				System.out.println("Case"+" "+i+" : "+c );
			    
		    
			    
			
			
		}
	}

}
