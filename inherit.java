package first;

 class Baseclas 
 {

	 void base()
	 {
		 System.out.println("in Base:");
	 }
	 
 }
 class Derive extends Baseclas
 {
	 void deriv()
	 {
		super.base();
		System.out.println("in Derived:");

	 }
 }	 
	class inherit
	{
	     public static void main(String[] args) 
	     {
		// TODO Auto-generated method stub
          Derive d = new Derive();
          d.deriv();
          //d.base();
	    }

  } 
