Demo6
package javapractice;
import java.util.Scanner;
public class Demo6 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
      
       System.out.print("Enter the number of elements in the array: ");
       int size = scanner.nextInt();
       int[] array = new int[size];
     
       System.out.println("Enter " + size + " integers:");
       for (int i = 0; i < size; i++) {
           array[i] = scanner.nextInt();
       }
       System.out.print("Enter the key to search for: ");
       int key = scanner.nextInt();
       boolean found = false;
       for (int i = 0; i < size; i++) {
           if (array[i] == key) {
               System.out.println("Key found at index: " + i);
               found = true;
               break;
           }
       }
       if (!found) {
           System.out.println("Key not found in the array.");
       }
   }
}
