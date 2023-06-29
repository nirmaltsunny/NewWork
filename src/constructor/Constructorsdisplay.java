package constructor;

public class Constructorsdisplay {

	int studentid;
	String studentname;
	public Constructorsdisplay(int studentid,String studentname) 
	{
		this.studentid =studentid;
		this.studentname=studentname;
	
	}
	public void display()
	{
		System.out.println("studentid="+studentid);
		System.out.println("studentname="+studentname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Constructorsdisplay st=new Constructorsdisplay(112,"Gokul");
      st.display();
	}

}
