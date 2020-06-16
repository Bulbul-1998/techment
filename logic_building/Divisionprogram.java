package tech;

import java.util.*;

public class Divisionprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
      System.out.println("enter two numbers");
      int num1=sc.nextInt();
      int num2=sc.nextInt();
      try {
    	   
    	  
    	  
    	  if(num2==0)
    		  throw new ArithmeticException();
    	  else
    	  System.out.println("the quitient is"+num1/num2);
      }
      catch(ArithmeticException e)
      {
    	  System.out.println("divide by zero exception caught");
    	  
    	 
       }
      finally
      {
    	  System.out.println("inside final block");
      }
	}

}
