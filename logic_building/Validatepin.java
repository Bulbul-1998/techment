package tech;

import java.util.Scanner;

public class Validatepin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int pin=12345;
      System.out.println("WELCOME TO THE BANK");
      System.out.println("ENTER YOUR PIN");
      int entry=sc.nextInt();
      while(pin!=entry)
      {
    	  System.out.println("incorrect pin");
    	  System.out.println("enter your pin");
    	  entry=sc.nextInt();
      }
      System.out.println("PIN ACCEPTED NOW YU CAN ACCESS YOUR ACCOUNT");
      
	
	}

}
