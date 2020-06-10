package tech;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("enter a day value(1-31)-");
    Scanner sc=new Scanner(System.in);
    int day=sc.nextInt();
    if(day<1||day>31)
    {
    	System.out.println("invalid output");
    }
    else
    {
    	if(day%2==0)
    		System.out.println("cars with even reg. is allowed");
    	else
    		System.out.println("car with odd reg. is allowed");
    }
	}

}
