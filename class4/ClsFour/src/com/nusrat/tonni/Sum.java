package com.nusrat.tonni;


import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n,m;
		n=input.nextInt();
		m=input.nextInt();
		int x[] []=new int[n][m];
		int y[] []=new int[n][m];
		int z[] []=new int[n][m];
		int i,j;
		
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
				x[i][j]= input.nextInt();
			}
		}
			
		for(i=0;i<y.length;i++)
			{
				for(j=0;j<y[i].length;j++)
				{
					y[i][j]= input.nextInt();
				}
			}

		for(i=0;i<x.length;i++)
			{
				for(j=0;j<x[i].length;j++)
				{
						z[i][j]=x[i][j]+y[i][j];
				}

			}
		for(i=0;i<z.length;i++)
			{
				for(j=0;j<z[i].length;j++)
				{
					System.out.print(z[i][j]+ " ");
				}
					System.out.println();
				}
					
			}


}
