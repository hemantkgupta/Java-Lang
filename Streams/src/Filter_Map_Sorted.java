import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Filter_Map_Sorted {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Filter names that start with "A", convert them to uppercase, sort, and print each name
        names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()                       // Sorting the names alphabetically
                .forEach(System.out::println);  // Terminal operation, prints each name

        // Convert to uppercase, reverse sort, and print each name
        names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())                       // Sorting the names in reverse alphabetically
                .forEach(System.out::println);                          // Terminal operation, prints each name
    }
}
