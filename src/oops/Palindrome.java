package oops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int temp=b;
		int s=0,r;
		while(b>0)
		{
			r = b%10;
			s=s*10+r;
			b=b/10;
			
		}
         System.out.println(s);
         if (s==temp)
         {
        	 System.out.println("This is palindrome");
         }
         else
         {
        	 System.out.println("This is not palindrome");
         }
	}

}
