package first;

abstract class AA   //Incomplete class & cannot create obj of class
{
	abstract void show(); //Abstract meyhod need body from child class
	void hi()
	{
		System.out.println("in Hi..");
	}
}
class BB extends AA
{
	void show()
	{
		System.out.println("in Show..");
	}
}
public class Abstrction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    BB b1 = new BB();
    b1.show();
    b1.hi();
	}

}
