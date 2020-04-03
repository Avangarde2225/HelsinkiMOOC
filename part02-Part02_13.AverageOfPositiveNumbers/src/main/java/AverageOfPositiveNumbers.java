
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPositive = 0;
        int countNegative = 0;
        int sum = 0;
 
        while (true) {
 
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }
            if (number >= 0) {
                countPositive++;
                sum = sum + number;
            }
 
        }
        double avg = (double) sum / countPositive;
        System.out.println(avg);
     
    }
}

    

