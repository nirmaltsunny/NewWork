package arrayPgms;

import java.util.Scanner;

public class NamesPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String [] arr =new String[5];
        System.out.println("Enter names");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
        	arr[i]=sc.next();
        }
        System.out.println("Entered names");
       // for(int i=0;i<5;i++)
      //{
        	//System.out.println(arr[i]);
        //}
        for(String v: arr)
        {
        	System.out.println(v);
        }
	}

}
