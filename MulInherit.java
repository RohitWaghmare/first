package first;

interface Mobile
{
	public void Samsung();
}
interface Laptop
{
	public void Lenovo();
}
class Gadget implements Mobile, Laptop
{
	public void Samsung()
	{
		System.out.println("Samsung");
	}
	public void Lenovo()
	{
		System.out.println("Lenovo");
	}
}

public class MulInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Gadget g1 = new Gadget();
    g1.Lenovo();
    g1.Samsung();
	}

}
