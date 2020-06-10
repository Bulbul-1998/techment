package tech;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1,num2,result;
		char operator;
		System.out.println("Enter the expression");
		num1=sc.nextInt();
		operator=sc.next().charAt(0);
		num2=sc.nextInt();
		switch(operator)
		{
		case '+':
		result=num1+num2;
		System.out.println("result of addition"+result);
		break;
		case '-':
		result=num1-num2;
		System.out.println("result of subtraction"+result);
		break;
		case '*':
			result=num1*num2;
			System.out.println("result of multiplication"+result);
			break;
		case '/':
			result=num1/num2;
			System.out.println("result of division"+result);
			break;
			default:
				System.out.println("invalid input");
		
		
		}

	}

}
