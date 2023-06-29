package arrayPgms;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods ds =new Methods();
		ds.add();
		int subt = ds.sub();
		System.out.println(subt);
	
		System.out.println(ds.mul(22, 88));
	    ds.div(7.89, 5.5);
	   
		

	}
	public void add()
	{
		int a=10;
		int b=20;
		int sum =a+b;
		System.out.println(sum);
	}
public int sub()
{
	int a =10;
	int b=50;
	int sub =a-b;
	return sub;
}

public int mul(int a,int b)
{
	int multi = a*b;
	return multi;
}
public void div(double a,double b)
{
	 double c=0;
      c=a/b;
      System.out.println(c);
	
}
}
