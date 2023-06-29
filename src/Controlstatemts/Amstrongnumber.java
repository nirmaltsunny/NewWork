package Controlstatemts;

import java.util.Scanner;

public class Amstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Enter a 3 digit number");
         Scanner sc = new Scanner(System.in);
         int number=sc.nextInt();
         int orginal=number;
         int r,s=0,result=0;
         while(orginal !=0)
         {
        	 r=orginal%10;
        	 result += Math.pow(r, 3);
        	 orginal =orginal/10;
         }
        
         if(result==number)
         {
        	 System.out.println("Amstrong number");
         }
         else
         {
        	 System.out.println("Not an amstrong number");
         }
	}

}
