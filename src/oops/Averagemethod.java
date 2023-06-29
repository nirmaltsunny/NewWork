package oops;

import java.util.Scanner;

public class Averagemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Enter 3 numbers");
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     Averagemethod g= new Averagemethod();
     g.Average(a,b,c);
     
     
	}
 public void Average(int a,int b,int c)
 {
	 int avg=(a+b+c)/3;
	 System.out.println("Average="+avg);
 }
 
}
