package arrayPgms;

import java.util.Scanner;

public class Countvowels {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String sr = sc.nextLine();
		int c=0;
		for(int i=0;i<sr.length();i++)
		{
			if(sr.charAt(i)=='a'||sr.charAt(i)=='e'||sr.charAt(i)=='i'||sr.charAt(i)=='o'||sr.charAt(i)=='u')
             {
	c++;
               }
		}
		
		System.out.println("Count of vowels"+c);
		

	}

}
