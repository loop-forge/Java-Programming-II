
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            String str = scanner.nextLine();
            int integer = Integer.valueOf(str);
            if(integer == 0){
                break;  
            } 
            if(integer>0){
                count++;
                sum += integer;
            }
        }

        if(sum == 0) {
            System.out.println("Cannot calculate the average");
        } else if(count != 0){
            System.out.println(avg(sum, count));
        }
    }

    public static double avg(int sum, int count){
        return 1.0 * sum / count;
    }
}
