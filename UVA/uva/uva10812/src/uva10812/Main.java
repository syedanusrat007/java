package uva10812;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int n,s,d,i;
		n=input.nextInt();
		for(i=0;i<n;i++)
		{
			s=input.nextInt();
			d=input.nextInt();
			if(s>=d && (s+d)%2==0)
			{System.out.println((s+d)/2 + " "+(s-d)/2);
			
				
			}
			else
				System.out.println("impossible");
		}
		

	}

}
