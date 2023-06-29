package oops;

public class Exceptionpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=20;int b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Arithmetic exception");
		}
		System.out.println("hello");
		try
		{
			int a[]=new int[2];
			a[0]=0;
			a[1]=11;
			System.out.println(a[3]);
		}
		catch(Exception e)
		{
			System.out.println("arrayindexoutofbound exception");
		}
		try
		{
		String s=null;
		System.out.println(s.length());
	}
		catch(Exception e)
		{
			System.out.println("Null point Exception");
		}

}
}