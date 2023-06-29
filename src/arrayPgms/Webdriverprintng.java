package arrayPgms;

public class Webdriverprintng {

	public static void main(String[] args) {
		String s1 = "selenium webdriver is used for webapplication testing";
		String sr[] =s1.split(" ");
		for(String v:sr)
		{
			System.out.println(v);
			if(v.contains("webapplication"))
			{
				break;
			}
		}

	}

}
