package arrayPgms;

public class Functionsstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="HHHello";
      String s1="        welcome";
      String s2="hello,how are you?";
      System.out.println(s.concat(s1));
      System.out.println(s+s1);
      System.out.println(1+2+3+s+4+5);
      System.out.println(s.equals(s2));
      System.out.println(s.equalsIgnoreCase(s2));
      System.out.println(s2.contains("how"));
      System.out.println(s.toLowerCase());
      System.out.println(s.toUpperCase());
      System.out.println(s1.trim());
      System.out.println(s2.length());
      System.out.println(s2.startsWith("hello"));
      System.out.println(s2.endsWith("you"));
      
      System.out.println(s2.substring(2,6));
      System.out.println(s.charAt(1));
      String [] sr=s2.split(" ");
      for(String v :sr)
      {
    	  System.out.println(v);
      }
	}

}
