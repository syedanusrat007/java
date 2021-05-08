package com.oop.cls;

public class Invoice {

		String mn;
		float up;
		int qnt;
		public Invoice (String mn,float up,int qnt)
		{
			this.mn=mn;
			this.up=up;
			this.qnt=qnt;
		}
		public double total()
		{
			double t=up*qnt;
			return t;
		}

	}


