package tech;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		if(num%8==0&&num%3==0)
		{
			System.out.println(num+"is divisible by both 8 and 3");
		}
		else
		{
			System.out.println(num+"is not divisible by both 8ans 3");
		}
	}

}
