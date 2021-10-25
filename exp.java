package first;

class A
{
	 int roll;
	 double perc;
	 int gv = 10;
	 final int fin = 99;
	 void display() // Method
	 {
		 int lv = 1;
		 System.out.println("Local & Method:" + lv);
	 }
	 void display(int i) //Method Overloading
	 {
         this.display();
		 int lv = i;
		 System.out.println("Method Overloading:" + lv);
	 }
	 A(int d, int e) // Constructor
	 {
		 int s = d;
		 int r = e;
		 System.out.println("Constructor of 2 Par:" + s + " & " + r);
		 //System.out.println("Constructor of 2 Par:" + r);
	 }
	 A(int m, int n, int z) // Constructor Overloading
	 {
		 int j = m;
		 int k = n;
		 int l = z;
		 System.out.println("Constructor Overloading:" + j + " "+ k + " " + l);
		 //System.out.println("Constructor of 2 Par:" + r);
	 }
	 A(int roll, double perc)  //this keyword
	 {
		 this.roll = roll;
		 this.perc = perc;
         System.out.println("Use of this:" + roll + " & " + perc);
	 }
	 public A() {
		// TODO Auto-generated constructor stub
	}
	/*void thisdisplay()
	 {
		 System.out.println("Use of this:" + roll + " & " + perc);
	 }*/
}
class B 
{
  int p = 80;
  int rollno;
  double sal;
  final char bfin = 'F';
  void laptop() // Method
  {
  int y = 8;
  System.out.println("B: Local var & Method:" + y);
  }
  void laptop(int s) // Method Overloading
  {
  this.laptop();
  int Blv = s;
  System.out.println("In B:Local & Method Overloading:");
  }
  B(int rollno, double sal) // Constructor
  {
    this.rollno = rollno;
    this.sal = sal;
    System.out.println("\n\nClass B Constructor with this:" + rollno + " " + sal);
  }
   B(int j) // Constructor Overloading
  {
    int k = j;
    System.out.println("Class B Constructor Overloading:");
  }
   public B() {
	}
}
 class exp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
    A A1 = new A(40,50);  //Constructor
    A A2 = new A(40,50,60);
    A A3 = new A(60,70.80);
    A A4 = new A();
    A1.display(20);
    System.out.println("Global:" + A1.gv);
    System.out.println("Final:" + A4.fin);
   
    B b1 = new B(55,50.6); // B class
    B b2 = new B(30);
    B b3 = new B();
    b1.laptop(5);
    System.out.println("B Global:" + b1.p);
    System.out.println("Final:" + b3.bfin);
	}

}
