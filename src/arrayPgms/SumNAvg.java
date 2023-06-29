package arrayPgms;

import java.util.Scanner;

public class SumNAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter numbers");
		int [] arry=new int[5];
		Scanner sc = new Scanner(System.in);
		int sum =0;
		for(int i=0;i<5;i++)
		{
			arry[i]=sc.nextInt();
		}
		for(int v:arry)
		{
	
         sum =sum +v;
		}
		System.out.println(sum);
		int avg = sum/5;
		System.out.println(avg);
	}

}
