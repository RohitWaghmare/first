package first;

import java.util.Scanner;
 //package first;

public class Array {
	 public static void main(String args[])
		{
	int a[] = new int[3];
	 Scanner sc = new Scanner(System.in);
    System.out.println("Enter values:");
    for(int i = 0; i<3; i++)
      {
        a[i] = sc.nextInt();
     }
    for(int i = 0; i<3; i++)
    {
       System.out.println("values:" + a[i]);
    }
	}
}	 
	 
