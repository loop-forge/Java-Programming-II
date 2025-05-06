
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            if(str.equals("end")){
                break;  
            }
            System.out.println(cube(Integer.valueOf(str)));
        }
    }

    public static int cube(int number){
        int cube = number*number*number;
        return cube;
    }
}
