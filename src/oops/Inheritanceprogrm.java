package oops;
class member
{
String Name;
int age;
int phoneno;
String address;
int salary;
 public void printdetails(String Name, int age,int phoneno,String address,int salary)
 {
	
	 
	 System.out.println("Name="+Name);
	 System.out.println("Phoneno="+phoneno);
	 System.out.println("age="+age);
	 System.out.println("address="+address);
	 System.out.println("salary="+salary);
 }
 
}

class employee extends member
{
	String specialization;
	public void department(String specialization)
	{
		 
		 System.out.println("specialization="+specialization);
	}
}
class manager extends member
{
	String departments;
	public void department(String departments)
	{
		 
		 System.out.println("departments="+departments);
}
}
public class Inheritanceprogrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employee ey=new employee();
		ey.printdetails("Athi", 23, 2345454, "lovedale", 900000);
		ey.department("Electronics");
		
        manager mn=new manager();
        mn.department("Electrical");
        mn.printdetails("Kevin", 89, 9087655, "LIne:098", 900000);
        
        
	}

}


