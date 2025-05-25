
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        ArrayList<Integer> liste = new ArrayList<>();

        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            else{
                liste.add(Integer.valueOf(input));
            }
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();

        double average = 0.0;
        if (input.equals("n")) {
            average = liste.stream()
                        .mapToInt(s -> Integer.valueOf(s))
                        .filter(value -> value < 0)
                        .average()
                        .orElse(0.0);
        } else if (input.equals("p")) {
            average = liste.stream()
                        .mapToInt(s -> Integer.valueOf(s))
                        .filter(value -> value >= 0)
                        .average()
                        .orElse(0.0);
        }
        System.out.println("average of the numbers: " + average);
    }
}
