package tech;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of rows");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println(" ");
			
		}

		for(int i=rows-1;i>=1;i--)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println(" ");
	}

}
}