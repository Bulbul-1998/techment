package tech;

import java.util.Scanner;

public class Birthmonth {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("enter your birthday month");
      int month = sc.nextInt();
      switch(month)
      { 
      case 1:System.out.println("your birthday month is in january");
      break;
      case 2:System.out.println("your birthday month is in february");
      break;
      case 3:System.out.println("your birthday month is in march");
      break;
      case 4:System.out.println("your birthday month is in april");
      break;
      case 5:System.out.println("your birthday month is in may");
      break;
      case 6:System.out.println("your birthday month is in june");
      break;
      case 7:System.out.println("your birthday month is in july");
      break;
      case 8:System.out.println("your birthday month is in august");
      break;
      case 9:System.out.println("your birthday month is in september");
      break;
      case 10:System.out.println("your birthday month is in october");
      break;
      case 11:System.out.println("your birthday month is in novemer");
      break;
      case 12:System.out.println("your birthday month is in december");
      break;
      default:
    	  System.out.println("invalid month");
      }
     
      
      
	}

}
