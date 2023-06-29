package Controlstatemts;

import java.util.Scanner;

public class Assignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Enter numbers");
     Scanner sc=new Scanner(System.in);
     int arr[]=new int[100];
     int countP=0,countN=0,countZ=0,i;
     for( i=0;i<=10;i++)
     {
    	 arr[i]=sc.nextInt();
    	 System.out.println(arr[i]);
     
     
     
    	 if(arr[i]>0)
    	 {
    		 countP++;
    	 }
    	 else if(arr[i]<0)
    	 {
    		 countN++;
    	 }
    	 else
    	 {
    		 countZ++;
    	 }
    	
     }
     
       System.out.println("Count of positive integers:"+countP);
	   System.out.println("Count of negative integers:"+countN);
	   System.out.println("Count of zeros:"+countZ);
     }
}     
	



