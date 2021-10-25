package first;

class Abc
{
	private int c;
	 void setter(int c)
	{
		this.c = c;
	}
	 int getter()
	{
		return c;
	}
}
public class Encapsul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Abc A1 = new Abc();
    A1.setter(70);
    System.out.println(A1.getter());
	}

}
