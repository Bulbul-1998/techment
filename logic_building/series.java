package tech;

import java.util.Scanner;

public class series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of terms");
		int num=sc.nextInt();
		int term=1;
		for(int i=1;i<=num;i++)
		{
			System.out.print(i*i*i +" ");
		}
		
		
		

	}

}
