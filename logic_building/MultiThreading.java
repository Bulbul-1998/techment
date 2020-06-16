package tech;

import java.util.Scanner;

public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of$ to be printed");
		int dollar=sc.nextInt();
		System.out.println("enter no of'*' to be printed");
		int stars=sc.nextInt();
		Child t=new Child(stars);
		t.start();
		for(int i=0;i<dollar;i++)
		{
			System.out.println("$");
		}

		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

}
