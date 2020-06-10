package tech;

import java.util.Scanner;

public class Totalstock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of elemnts");
		int n= sc.nextInt();
		int arr[]=new int[n];
	
		
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
			 arr[i] =sc.nextInt();
		}
       int sum=0;
       for(int i=1;i<n;i++)
       {
    	   sum=sum+arr[i];
    
     }
       System.out.println("total product"+sum);
	}

}
