package oops;

public class Polymorphism {
	
	
		public void add()
		{
			int a=20;
			int b=30;
			int c=a+b;
			System.out.println(c);
		}
		public void add(int a,int b)
		{
			int c=a+b;
			System.out.println(c);
		}
		public void add(double a,int b)
		{
			double c=a+b;
			System.out.println(c);
		}
	

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Polymorphism dd=new Polymorphism();
        dd.add();
        dd.add(2.3, 8);
        dd.add(89, 67);
	}


	}


