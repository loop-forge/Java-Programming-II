
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         List<Integer> inputs = new ArrayList<Integer>(); 
        while(true){
            Integer s = Integer.valueOf(scanner.nextLine());
            if(s <0 ){
                break;
            }
            inputs.add(s);
        }
        inputs.stream().filter(v-> v>=1 && v<=5).forEach(v -> System.out.println(v));
    }
}
