package oops;

import java.util.Scanner;

public class RevereseNumbr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int s=0,r;
         System.out.println("Enter a number");
         Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
         while(n>0)
         {
        	 r = n%10;
        	 s = s*10+r;
        	 n=n/10;
        	 
         }
         System.out.println(s);
	}

}
