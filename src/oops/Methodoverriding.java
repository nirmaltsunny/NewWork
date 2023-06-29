package oops;
class car
{
	public void accelerator() {
	System.out.println("accelerator");
}
}
	class BMW extends car
	{

		@Override
		public void accelerator() {
			// TODO Auto-generated method stub
			System.out.println("bmw accelerator");
			super.accelerator();
		}

	}
		
	
public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  BMW hh=new BMW();
  hh.accelerator();
	}

}
