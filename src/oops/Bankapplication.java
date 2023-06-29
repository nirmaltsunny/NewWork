package oops;
import java.util.Scanner;

interface Bank45
{
	public void Showdetailss();
	public void balance();
	public void deposit();
	public void withdraw();
	
}
class SBIBank implements Bank45
{
	String customername="Manu";
	int Accountnumber =897654098;
	String bankdetails="SBI Kottayam";
	int deposit=2000;
	Scanner sc=new Scanner(System.in);
    int amt,balance;
	
	@Override
	public void Showdetailss()
	{
		System.out.println("Enter bank account number");
		int number  =sc.nextInt();
		if(Accountnumber==number)
		{
			System.out.println("Customer name: "+customername);
			System.out.println("Accountnumber: "+Accountnumber);
			System.out.println("Bankdetails: "+bankdetails);
		}
		else
		{
			System.out.println("The account number you entered is incorect");
		}
	}

	

	@Override
	public void deposit() {
		System.out.println("Enter the amount you want to deposit");
		int d = sc.nextInt();
		
		int amt = deposit+d;
		System.out.println("The total amount:"+amt);
		
	}
		
	

	@Override
	public void withdraw() {
		
		
		System.out.println("Enter your withdrawal amount");
		int z=sc.nextInt();
		int balance=amt-z;
		System.out.println("The account balance:"+balance);
		
	}
	@Override
	public void balance() {
	
		
			System.out.println("Balance :"+balance);
	}
}
public class Bankapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         SBIBank ob=new SBIBank();
         ob.Showdetailss();
         ob.deposit();
         ob.withdraw();
         ob.balance();
         
         
         
	}

}
