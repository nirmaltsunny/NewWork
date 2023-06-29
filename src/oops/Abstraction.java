package oops;

abstract class Car22{

abstract public void speedlimit();
public void carengine()
{
	System.out.println("car engine");
}
}
class Maruti extends  Car22
{

	@Override
	public void speedlimit() {
		// TODO Auto-generated method stub
		System.out.println("Marui speeedlimit");
	}
	
}

 public class Abstraction
 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maruti m=new Maruti();
		m.carengine();
		m.speedlimit();

	}
 }

