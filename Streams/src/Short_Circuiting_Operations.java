import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Short_Circuiting_Operations {

    public static void main(String[] args) {
        // 1. findFirst
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Optional<String> first = names.stream().findFirst();
        first.ifPresent(System.out::println);                   // Prints the first name, if present

        // 2. anyMatch(), allMatch(), noneMatch()
        boolean anyStartsWithA = names.stream().anyMatch(name -> name.startsWith("A"));
        System.out.println(anyStartsWithA);                     // true if any name starts with "A"

    }
}
