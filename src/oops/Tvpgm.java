package oops;

interface tvremote
{
	public void switchon();
	public void mute();
	public void channel();
}
interface smarttvremote extends tvremote
{
	public void online();
}
class TV implements smarttvremote
{

	@Override
	public void switchon() {
		System.out.println("Switching on");
		
	}

	@Override
	public void mute() {
		System.out.println("Mute");
		
	}

	@Override
	public void channel() {
		System.out.println("Channels on");
		
	}

	@Override
	public void online() {
		System.out.println("Switching online channels");
		
	}
	
}
public class Tvpgm {

	public static void main(String[] args) {
		TV tob=new TV();
		tob.mute();
		tob.channel();
		tob.switchon();
		tob.online();
	}

}
