package com.bhimangroup.regression;

import java.util.Scanner;

public class Pelindrome 
{
	public void p1() 
	{
		System.out.println("Enter number for Pelindrome..");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			 sum=sum*10+r;
			 n=n/10;
			
		}
		if(temp==sum)
		{
			System.out.println("Number is pelindrome..");
		}
		else
		{
			System.out.println("Number is Not Pelindrome..");
		}
		

	}
	public static void main(String[] args) {
		new Pelindrome().p1();
	}

}
