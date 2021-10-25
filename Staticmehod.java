package first;

class Stat
{
	static void cricket()
	{
		System.out.println("In Cricket");
	}
	public void tennis()
	{
		System.out.println("In Tennis");
	}
}
public class Staticmehod extends Stat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticmehod s1 = new Staticmehod();
		s1.tennis();
		cricket();
	}

}
