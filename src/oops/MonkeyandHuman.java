package oops;

interface Basicanimal
{
	public void eat();
	public void sleep();
}

class Monkey
{
	public void jump()
	{
		System.out.println("Jumping");	
		}
	public void bite()
	{
		System.out.println("Biting");
	}
}
class human extends Monkey implements Basicanimal
{
	public void speak()
	{
		System.out.println("Speaking");
	}

	@Override
	public void eat() {
		System.out.println("Eating");
		
	}

	@Override
	public void sleep() {
		System.out.println("Sleeping");
		
	}
	
}
public class MonkeyandHuman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             human ob =new human();
             ob.bite();
             ob.eat();
             ob.sleep();
             ob.speak();
             ob.jump();
             
	}

}
