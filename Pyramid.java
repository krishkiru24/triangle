package com.krish.programs;

public class Pyramid 
{
	public static void main(String[] args)
	{
		int n=5;
		int spec=n-1;
		int str=1;
		int x=1;
		for (int j=0;j<n;j++)
		{
		for(int i=0;i<spec;i++)
		{
			System.out.print(" "+" ");
		}
		for(int k=0;k<str;k++)
		{
			System.out.print(x +" ");
			if(k<str/2)
			{
			x++;
			}
		    else
				x--;
		}
		System.out.println();
	    spec--;
		str=str+2;
		x=1;
		}
	}
}
