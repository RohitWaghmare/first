package first;

interface Base
{
	public void tennis();  
	public void Cricket();
	
}
class Sports implements Base
{
	public void tennis()
	{
		System.out.println("In Tennis");
	}
	public void Cricket()
	{
		System.out.println("In Cricket");
	}
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Sports d1 = new Sports();
    d1.Cricket();
    d1.tennis();
	}

}
