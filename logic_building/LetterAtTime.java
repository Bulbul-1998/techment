package tech;

import java.util.Scanner;

public class LetterAtTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your message");
		String  msg=sc.nextLine();
		System.out.println("your mesage is"+msg.length()+"chracters long");    
	System.out.println("the first character is at position 0 and it is"+msg.charAt(0)+"");
	int last=msg.length()-1;
        System.out.println("the last character is at position "+last+"and it is"+msg.charAt(last));
      System.out.println("here are all characters");
      for(int i=0;i<msg.length();i++)
      {
    	  System.out.println(msg.charAt(i));
      }
        
      int count=0;
      for(int i=0;i<msg.length();i++)
      {
    	  char letter=msg.charAt(i);
    	  if(letter=='a'||letter=='A')
    	  {
    		  count++;
    	  }
      }
      System.out.println("your mesasage contains the letter 'a'" +count+"times");
      
	}

}
