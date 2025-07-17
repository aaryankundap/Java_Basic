Demo5
package javapractice;
import java.util.Scanner;
public class Demo5 {
   public static boolean isPalindrome(String str) {
       String reversed = new StringBuilder(str).reverse().toString();
       return str.equals(reversed);
   }
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String input = scanner.nextLine();
       if (isPalindrome(input)) {
           System.out.println("\"" + input + "\" is a palindrome.");
       } else {
           System.out.println("\"" + input + "\" is not a palindrome.");
       }
       scanner.close();
   }
}
