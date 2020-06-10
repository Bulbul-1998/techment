package tech;

import java.util.Scanner;

public class Supermarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of elemnts");
		int n= sc.nextInt();
		int arr[]=new int[n];
	
		
		System.out.println("enter the elements");
		for(int i=1;i<=n;i++)
		{
			 arr[i] =sc.nextInt();
		}
       int max=arr[1];
       for(int i=1;i<n;i++)
       {
    	   if(arr[i]>max)
    	   {
    		   max=arr[i];
             }
     System.out.println(max+"is the maximum element");
     }

	}
}
