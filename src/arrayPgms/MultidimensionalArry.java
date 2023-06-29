package arrayPgms;

import java.util.Scanner;

public class MultidimensionalArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println("Enter numbers");
           Scanner sc = new Scanner(System.in);
           int arry[][] =new int[3][2];
           
           for(int i=0;i<3;i++)
           {
        	   for(int j=0;j<2;j++)
        	   {
        		  arry[i][j]= sc.nextInt();
        	   }
           }
           //for(int i=0;i<3;i++)
           //{
        	//   for(int j=0;j<2;j++)
        	  // {
        		//  System.out.print(arry[i][j]);
        	 //  }
        	 //  System.out.println();
          // }
          for(int sq[]:arry)
          {
        	  for(int v: sq)
        	  {
        		 System.out.print(v);
        	  }
        	  System.out.println();
          }
	}

}
