
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int number = Integer.valueOf(scanner.nextLine());
        
        for(int i = 1; i <= number; i++){
            System.out.println(i);
        }
        
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        
        for(int j = first; j <= second; j++){
            
            System.out.println(j);
            
            if(second <= first){
                break;
            }
        }
    }
}
