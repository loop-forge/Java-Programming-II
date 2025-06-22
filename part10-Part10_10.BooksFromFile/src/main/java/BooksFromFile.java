
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        readBooks(null)
    }

    public static List<Book> readBooks(String file){
        ArrayList<String> rows = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();
        try {
            Files.lines(Paths.get(file)).forEach(row -> rows.add(row));
            rows.stream().forEach(row -> System.out.println("ok"));
        } catch(Exception e){
            System.out.println("Exception > " + e);
        }
        return books;
    }
}
