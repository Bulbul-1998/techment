package tech;

import java.util.Scanner;

public class Reversepyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the no of rows");
 int noofrows=sc.nextInt();
 int count=noofrows;
 System.out.println("here is the pyramid");
 for(int i=0;i<=noofrows;i++)
 {
	 for(int j=1;j<=i*2;j++)
	 {
		 System.out.print(" ");
	 }
	 for(int j=1;j<=count;j++)
	 {
		 System.out.print(j+" ");
	 }
	 for(int j=count-1;j>=1;j--)
	 {
		 System.out.print(j+" ");
	 }
	 
 System.out.println("");
 count--;
 }
	}

}
