package first;
import java.util.Scanner;

 class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   int a,b,c;
   System.out.println("Enter A:");
   a = sc.nextInt();
   System.out.println("Enter B:");
   b = sc.nextInt();
   c = a + b;
   System.out.println("Addition:" + c);

	}

}
