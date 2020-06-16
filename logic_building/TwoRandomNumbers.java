package tech;

import java.util.Random;

public class TwoRandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r=new Random();
		int num1=r.nextInt();
		int num2=r.nextInt();
System.out.println("first random number="+num1);
System.out.println("second random number="+num2);
if(num1==num2)
{
	System.out.println("random numbers were same");
}
if(num1!=num2)
{

System.out.println(" random numbers were different");
}
	}

}
