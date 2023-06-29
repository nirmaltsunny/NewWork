package oops;

import java.util.Scanner;

public class Summethod {
	int sum=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
           Scanner sc=new Scanner(System.in);
           System.out.print("Enter a numbr");
           int a =sc.nextInt();
           Summethod s= new Summethod();
           int sum =s.sumofintegers(a);
           System.out.print(sum);
          
	}
	public int sumofintegers(int a)
	{
	int r,s=0;
		
		while(a>0)
		{
			r=a%10;
			s=s+r;
			a=a/10;
		}
		
		return s;
	}

}
