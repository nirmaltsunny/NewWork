package pkg;

public class Operators {

	public static void main(String[] args) {
		//Arithmetic operator
		
		int a=20; int b=10;
	    System.out.println("a+b="+(a+b));
	    System.out.println("a-b="+(a-b));
	    System.out.println("a*b="+(a*b));
	    System.out.println("a/b="+(a/b));
	    System.out.println("a%b="+(a%b));
	    
        //Assignment operator
	    int c= 20; int d = 10;
	    System.out.println("c+=d="+(c+=d));
	    System.out.println("c-=d="+(c-=d));
	    
	    //Relational operator
	    System.out.println(a>b);
	    System.out.println(a<b);
	    System.out.println(a<=b);
	    System.out.println(a>=b);
	    System.out.println(a*=b);
	    System.out.println(a==b);
	    
	    //logical operator
	    String username = "abc";
	    String pswd = "123";
	    System.out.println(username == "abc" && pswd == "123");
	    System.out.println(username == "abc"  ||pswd == "1234");
	    System.out.println(!(username == "abc" && pswd == "123"));
	    
	    //unary operator
	    int d1=10;
	    System.out.println(d1++);//10
	    System.out.println(d1++);
	    System.out.println(d1);
	    
	    
	    
	    
	}

}
