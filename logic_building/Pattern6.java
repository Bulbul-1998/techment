package tech;

import java.util.Scanner;

public class MatrixManipulation {

	public static void main(String[] args) {
		int row,col,i,j;
	    Scanner sc = new Scanner(System.in);
	      
	      //Input the size of the matrix 
	      System.out.println("Enter the number of rows and columns of matrix:");
	      row = sc.nextInt();
	      col = sc.nextInt();
	 
	      int array1[][] = new int[row][col],
	          array2[][] = new int[row][col],
	          sum[][] = new int[row][col];
	      
	      
	      System.out.println("Enter the elements of first matrix:"); 
	      for (i= 0;i<row ;i++ )
	         for (j= 0;j<col;j++ )
	            array1[i][j] = sc.nextInt();
	      
	      
	      System.out.println("Enter the elements of second matrix:");
	      for (i=0;i<row;i++)
	         for (j=0; j<col; j++ )
	            array2[i][j] = sc.nextInt();
	 
	      for (i=0;i<row;i++)
	         for (j=0;j<col;j++)
	             sum[i][j] = array1[i][j] + array2[i][j];  
	 
	      System.out.println("Sum of matrices");
	 
	      for (i=0;i<row;i++)
	      {
	         for (j=0;j<col;j++)
	            System.out.print(sum[i][j]);
	 
	         System.out.println();
	      }

	}

}