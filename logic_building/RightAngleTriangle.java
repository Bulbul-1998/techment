package tech;

import java.util.Scanner;

public class RightAngleTriangle {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
     System.out.println("enter the sides of the triangle");
     int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      System.out.println(" ");
      if(a>b&&a>c)
      {
    	  if((a*a)==(b*b)+(c*c))
    	  {
    		  System.out.println("it is a right angle triangle");
    	  }
    	  else
    	  {
    		  System.out.println("it is not a right angle triangle"); 
    	  }
      }
      if(b>b&&b>c)
      {
    	  if((b*b)==(a*a)+(c*c))
    	  {
    		  System.out.println("it is a right angle triangle");
    	  }
    	  else
    	  {
    		  System.out.println("it is not a right angle triangle"); 
    	  }
      }
      if(c>a&&c>b)
      {
    	  if((c*c)==(b*b)+(a*a))
    	  {
    		  System.out.println("it is a right angle triangle");
    	  }
    	  else
    	  {
    		  System.out.println("it is not a right angle triangle"); 
    	  }
      }
	}

}
