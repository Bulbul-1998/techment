package tech;

import java.util.Random;

public class Dicegame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("roll dice");
		Random r1=new Random();
		int num1=r1.nextInt(6);
		System.out.println("number is;"+num1);
		Random r2=new Random();

System.out.println("roll dice again");
		int num2=r2.nextInt(6);
		System.out.println("number is"+num2);
		if(num1%2==0&&num2%2==0)
		{
			System.out.println("point"+(num1+num2));
		}
		else
		{
			if(num1>num2)
			{
				System.out.println("points="+(num1-num2));
				
			}
			else
			{
				System.out.println("points="+(num2-num1));
			}
		}
		
		

	}

}
