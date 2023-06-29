package oops;

public class Palindromestring {

	public static void main(String[] args) {
		String S="malayalam";
		String r="";
		for(int i= S.length()-1; i>=0;i--)
		{
			r=r+S.charAt(i);
			
		}
        if(r.equals(S))
        {
        System.out.println("palindrome");
        }
        else
        {
        	System.out.println("Not a palindrome");
        }
	}

}
