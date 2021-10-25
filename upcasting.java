package first;

class parent
{
 void base()
 {
  System.out.println("in Base");
 }
}
class child extends parent
{
 void base()
 {
  System.out.println("in Derived");
 }
}
public class upcasting
  {
	 public static void main(String[] args) 
	  {
		 parent myObj = new child(); 
	    myObj.base();
	  }
  }
