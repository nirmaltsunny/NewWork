package Controlstatemts;

public class ReverseNumber {

	public static void main(String[] args) {
		int number =3456;
		int remainder=0;
		int reverse =0;
		while(number!=0)
		{
		remainder =number%10;
		reverse= number*10+remainder;
		number= number/10;
		}
System.out.println(number);
	}

}
