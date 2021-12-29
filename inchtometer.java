import java.util.Scanner;
public class inchtometer {

    public static void main(String[] Strings) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Input a value for inch: ");
            double inch = input.nextDouble();
            double meters = inch * 0.0254;
            System.out.println(inch + " inch is " + meters + " meters");
        }

    }
}