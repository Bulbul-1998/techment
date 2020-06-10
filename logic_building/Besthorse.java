package tech;

import java.util.Scanner;

public class Besthorse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     System.out.println("enter the weight of 1st horses");
     int x=sc.nextInt();
     System.out.println("enter weight of 2nd horse");
     int y=sc.nextInt();
     System.out.println("enter the weight of 3rd horse");
     int z=sc.nextInt();
	 if(x>y&&x>z)
		 System.out.println("first horse is best");
	 else if(y>x&&y>z)
	 System.out.println("second horse is best");
	 else if(z>x&&z>y)
		 System.out.println("third horse is best");
	 else
		 System.out.println("invalid input");
		  
	
	}

}
