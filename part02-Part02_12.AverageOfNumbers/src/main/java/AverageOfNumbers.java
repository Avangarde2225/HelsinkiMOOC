
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double numbers = 0;

        while (true) {
            System.out.println("Give a number: ");
    
            double number = Double.valueOf(scanner.nextLine());

    
            if (number == 0) {
                break;
                
            }
           
            sum = number + sum;
            
            numbers = numbers + 1;
           
                
        }
        System.out.println("Average of the numbers: " + sum /(numbers));
    }
}
