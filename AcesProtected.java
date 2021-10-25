package first;

class Access
{
	protected int b = 10;
}

public class AcesProtected extends Access
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AcesProtected A1 = new AcesProtected();
        System.out.println(A1.b);
	}   
}
