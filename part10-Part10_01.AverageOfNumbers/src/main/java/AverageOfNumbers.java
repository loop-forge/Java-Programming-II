
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

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

        double average = liste.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble();
        System.out.println("average of the numbers:" + average);
    }
}
