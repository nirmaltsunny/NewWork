package oops;

class Animal1
{
	public void breed()
	{
		System.out.println("breed'");
	}
}
class tiger extends Animal1
{
	public void tigerfood()
	{
		System.out.println("pellets");
		
	}
}
class Cat extends Animal1
{
	public void catfood()
	{
		System.out.println("catfood");
	}
}
public class Hieririchialinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tiger ob=new tiger();
		Cat co=new Cat();
		ob.breed();
		co.breed();
		ob.tigerfood();
		co.catfood();

	}

}
