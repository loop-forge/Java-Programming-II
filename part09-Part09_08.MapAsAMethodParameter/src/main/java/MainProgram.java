import java.util.HashMap;
import java.util.Map;

public class MainProgram {

    public static void main(String[] args) {
        // test your method here
        Map<String, String> names  = new HashMap<>();
        names.put("ganbatte", "good luck");
        names.put("hai", "yes");

        System.out.println(returnSize(names ));

    }

    // Implement here a method returnSize, which takes a Map-object as a parameter 
    // and returns the size of the map object
    public static int returnSize(Map<String, String> map){
        return map.size();
    }
}
