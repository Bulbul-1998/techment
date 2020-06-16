package tech;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number for the table");
		int num1=sc.nextInt();
		System.out.println("it is the table of"+num1);
		for(int i=1;i<=10;i++)
		{
			System.out.println(num1+"*"+i+"="+num1*i);
		}

	}

}
