package oops;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b =sc.nextInt();
		System.out.println("Enter your choice 1.Add 2.Sub 3.Mul 4.Div");
		int op = sc.nextInt();
		double result =0;
		switch(op)
		{
		case 1 :result = a+b;
		break;
		case 2 :result = a-b;
		break;
		case 3 :result = a*b;
		break;
		case 4 :
		if(b==0)
		{
			System.out.println("not divisible");
		}
		else
		{
			result =a/b;
		}
		break;
		default: System.out.println("invalid choice");
		}
		
		System.out.println(result);
		
		

	}

}
