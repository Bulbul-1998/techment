package tech;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year");
		int year = sc.nextInt();
		boolean value = false;
	
		if(year%400==0)
		{
			value=true;
		}
		else if(year%100==0)
		{
			value=false;
		}
		else if(year%4==0)
		{
			value=true;
		}
		else
		{
			value=false;
		}
		if(value)
		{
			System.out.println("year is leap year");
			
		}
		else
		{
			System.out.println("not a leap year");
		}
		

	}

}
