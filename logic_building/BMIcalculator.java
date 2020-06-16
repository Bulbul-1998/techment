package tech;

import java.util.Scanner;

public class BMIcalculator {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       System.out.println("enter you weight in kg");
       Scanner sc=new Scanner(System.in);
       float weight=sc.nextFloat();
       System.out.println("please enter your height in cm ");
       float height=sc.nextFloat();
       float bmi=(100*100*weight)/(height*height);
       System.out.println("your bmi is"+bmi);
       if(bmi<18.5)
    	   
       {
    	   System.out.println("you are underweight");
       }
    	   else if(bmi<25)
    	   {
    		   System.out.println("you are normal");
    	   }
    	   else if(bmi<30)
    	   {
    		   System.out.println("you are overweight");
    		  
    	   }  
    		   
    		else
    		   {
    			   System.out.println("you are obessed");
    		   }
    	   
       }	   
       
	}


