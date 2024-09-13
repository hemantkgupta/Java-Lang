import java.util.Arrays;
import java.util.List;

public class Filter_Map_Print {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Filter names that start with "A" and convert them to uppercase, then print each name
        names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);  // Terminal operation, prints each name
    }
}
