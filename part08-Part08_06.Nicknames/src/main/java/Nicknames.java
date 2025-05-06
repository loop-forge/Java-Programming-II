
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> nickNames = new HashMap<String, String>();
        nickNames.put("matthew" , "matt");
        nickNames.put("michael" , "mix");
        nickNames.put("arthur" , "artie");

        String matthewNickName = nickNames.get("matthew");
        System.out.println(matthewNickName);
    }

}
