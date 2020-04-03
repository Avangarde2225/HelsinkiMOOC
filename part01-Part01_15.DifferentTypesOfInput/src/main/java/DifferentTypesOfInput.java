
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        
        System.out.println("Give a string:");
        String bye = scan.nextLine();
        System.out.println("Give an integer:");
        int num = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double num2 = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        Boolean bol = Boolean.valueOf(scan.nextLine());
System.out.println("You gave the string " + bye);
System.out.println("You gave the integer " + num);
System.out.println("You gave the double " + num2);
System.out.println("You gave the boolean " + bol);

    }
}
