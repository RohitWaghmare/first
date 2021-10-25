package first;

public class StaticVar
{
	  static int c = 5;
	}

	class Main extends StaticVar {
	  public static void main(String[] args) {
	       System.out.println("value:"+ c);

	  }
	}