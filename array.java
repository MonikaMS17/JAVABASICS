
import java.util.Scanner;

public class array {
   public static void main(String args[]) {
      System.out.println("Enter the required size of the array: ");
      try (Scanner s = new Scanner(System.in)) {
        int size = s.nextInt();
          int myArray[] = new int [size];
          System.out.println("Enter the elements of the array ");
          for(int i=0; i<size; i++) {
             myArray[i] = s.nextInt();
          }
    }
      
   }
}
