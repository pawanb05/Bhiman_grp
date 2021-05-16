package com.bhimangroup.regression;

import java.util.Scanner;

public class ReverseString 
{
	void reverse()
	{
		System.out.println("Enter String for reverse..");
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		String rev="";
		int l=str.length();
		
		for (int i = l-1; i >=0 ;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		System.out.println("Reverse String is : "+rev);
		
		
	}
	
	public static void main(String[] args)
	{
		new ReverseString().reverse();
		
	}

}
