package first;

//filename: Main.java
class AB
{
void A1()  // 3 Methods
{
  System.out.println("in A1");
 }
 void A2()
{
  System.out.println("in A2");
 }
void A3()
{
  System.out.println("in A3");
 } 
}  
class CD extends AB
{
void B1()
{
  System.out.println("in B");
 }
void B2()
{
  System.out.println("in B2");
 }
}  
class main
{
  public static void main(String[] args)
{
   AB objA = new CD();
   objA.A1();
   objA.A2();
   objA.A3();  
}
}

