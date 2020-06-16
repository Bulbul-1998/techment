package tech;

import java.util.*;

class invalidAgeException extends Exception
{
	
}
public class voteEligibility {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your age");
		try 
		{
			int age=sc.nextInt();
			if(age>=18)
			{
				System.out.println("you are eligible to vote");
			}
			else
			{
				throw new invalidAgeException();
			}
		}
			catch(invalidAgeException e)
			{
				System.out.println("exception occurs"+e+"age not valid");
			}
		}

	}

}
