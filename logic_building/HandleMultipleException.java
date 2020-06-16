package tech;

import java.util.Scanner;

public class HandleMultipleException {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    try
    {
    	System.out.println("enter the size of aaray");
    	int size=sc.nextInt();
    	int arr[]=new int[size];
    	System.out.println("enter elements in the array");
    	
    	for(int i=0;i<size;i++)
    	{
    		arr[i]=sc.nextInt();
    	}
    	System.out.println("enter the index of array u want to access");
    	
    	int index=sc.nextInt();
    	System.out.println("the array element at index"+index+"is"+arr[index]);
    	System.out.println("array element successfully accessed");
    	
    	}
    catch(ArrayIndexOutOfBoundsException e)
    {
    	System.out.println(e);
    }
	}

}
