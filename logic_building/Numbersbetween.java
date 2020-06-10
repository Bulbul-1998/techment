package tech;

import java.util.Scanner;

public class Numbersbetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the first number");
   int first=sc.nextInt();
   System.out.println("enter the last number");
   int last=sc.nextInt();
   for(int i=first;i<=last;i++)
   {
	   System.out.println(i);
   }
   
	}

}
