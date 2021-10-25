package first;

 class Exception 
 {
	 public static void main(String[] args)
	 {
			// TODO Auto-generated method stub
 
	 try 
	 {
		 int a = 40/0;
	 }
	 catch(ArithmeticException e)
	 {
		 System.out.println(e);
	 }
	 System.out.println("ye");

	}

}
