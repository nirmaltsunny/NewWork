package oops;

interface bank
{
	public void deposit();
	public void withdraw();
	public void balance();
}
interface creditcard
{
	public void creditcarddetails();
	
}
class SBI implements bank,creditcard
{

	@Override
	public void creditcarddetails() {
		System.out.println("sbicreditcard");
		
	}

	@Override
	public void deposit() {
		System.out.println("sbi deposit");
		
	}

	@Override
	public void withdraw() {
		System.out.println("sbi withdraw");
		
	}

	@Override
	public void balance() {
		System.out.println("sbi balance");
		
	}
	
}
class federal implements bank

{

	@Override
	public void deposit() {
		System.out.println("federal deposit");
		
	}

	@Override
	public void withdraw() {
		System.out.println("federal deposit");
		
	}

	@Override
	public void balance() {
		System.out.println("federal balance");
		
	}
	
}
public class Interfacepgm {

	public static void main(String[] args) {
		bank ob=new SBI();
		ob.balance();
		ob.deposit();
		ob.withdraw();
		SBI sb=new SBI();
		sb.creditcarddetails();
		ob=new federal();
		ob.balance();
		ob.deposit();
		ob.withdraw();
		
	
	}

}
