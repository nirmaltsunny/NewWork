package Controlstatemts;

import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter numbers");
		Scanner sc=new Scanner(System.in);
		int a=0,b=0,c=1;
		int z = sc.nextInt();
		
		for(int i=1;i<=z;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");
			
		}
     
	}

}
