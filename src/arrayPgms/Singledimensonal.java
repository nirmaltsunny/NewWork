package arrayPgms;

import java.util.Scanner;

public class Singledimensonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[3];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter numbers");
		for(int i=0;i<3;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Entered numbers");
		for(int i=0;i<3;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
