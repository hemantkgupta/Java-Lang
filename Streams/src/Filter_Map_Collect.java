import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Map_Collect {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        List<String> result = names.stream()
                .filter(name -> name.startsWith("B")) // filters names starting with “A”.
                .map(String::toUpperCase)             // transforms each string to uppercase.
                .collect(Collectors.toList());        // gathers the result into a list.

        // We can directly call forEach on a list
        result.forEach(System.out::println);

    }
}