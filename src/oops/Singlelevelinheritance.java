package oops;
 class Animal{
	 public void animalfood()
	 {
		 System.out.println("animal food");
	 }
 }
 
 class Dog extends Animal
 {
	 public void breed()
	 {
		 System.out.println("lab");
	 }
 }
 
 class babydog extends Dog
 {
	 public void babydogfeature()
	 {
		 System.out.println("baby dog");
	 }
 }
public class Singlelevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       babydog dg=new babydog();
       dg.animalfood();
       dg.babydogfeature();
       dg.breed();
	}

}
