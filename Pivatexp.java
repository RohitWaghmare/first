package first;

class AccSpeci
{
	public int a = 50;  // Private member access only by member of class
	void Printvalue()
	{
		System.out.println("Value:" + a);
	}
	
}
public class Pivatexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    AccSpeci A1 = new AccSpeci();
   // System.out.println("Value:" + A1.a);
    A1.Printvalue();
	}

}
