DEMO2
package javapractice;
import java.util.Scanner;
public class Demo2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=sc.nextInt();
		System.out.println("Enter the second number: ");
		int b=sc.nextInt();
		
		int c=a+b;
		System.out.println("Sum of a+b="+c);
	}
}
