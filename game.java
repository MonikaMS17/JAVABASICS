import java.util.Scanner;
public class game {
    public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your age : ");
            int age = sc.nextInt();
            
            if(age<=5) {
            	System.out.println("You are baby");
            }
            else if(age<=10) {
            	System.out.println("You are toddler");
            }
            else if(age<=18) {
            	System.out.println("You are teenaged");
            }
            else if(age<=25) {
            	System.out.println("You are adult");
            }
            else {
            	System.out.println("You are Grown old");
            }
        }
	}
    
}
