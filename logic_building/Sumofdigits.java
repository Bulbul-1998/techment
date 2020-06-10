package tech;
import java.util.*;
public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    System.out.println("enter two digit number");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int sum=0;
    while(num!=0) {
    	int rem=num%10;
    	sum=sum+rem;
    	num=num/10;
    }
    System.out.println(sum);
    }

}
