package tech;

import java.util.Scanner;

public class Comparearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number of elements");
     int n= sc.nextInt();
     int i;
     int arr1[]=new int[n];
     int arr2[]=new int[n];
     System.out.println("enter 1st arrray");
    for(i=0;i<n;i++)
        {
       	 arr1[i]=sc.nextInt();
        }
    System.out.println("enter 2 array");
    for(i=0;i<n;i++)
    {
   	 arr2[i]=sc.nextInt();
    }
    	 
    for(i=0;i<n;i++)
    {
    	if(arr1[i]!=arr2[i])
    	{
    		System.out.println("different");
    		break;
    	}
	
	
	
	
	}
    if( i==n)
    {
    	 System.out.println("equal");
    }
	}

}
