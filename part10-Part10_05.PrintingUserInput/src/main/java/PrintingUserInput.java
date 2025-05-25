
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<String>(); 
        while(true){
            String s = scanner.nextLine();
            if(s.equals("")){
                break;
            }
            inputs.add(s);
        }
        inputs.stream().forEach(v -> System.out.println(v));
    }
}
