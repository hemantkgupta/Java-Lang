import java.util.Arrays;
import java.util.List;

public class Intermediate_Operations {
    public static void main(String[] args) {
        // 1. filter()
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println); // Prints 2 and 4

        // 2. map()
        List<String> names1 = Arrays.asList("Alice", "Bob", "Charlie");
        names1.stream().map(String::toUpperCase).forEach(System.out::println); // Prints ALICE, BOB, CHARLIE

        // 3. sorted()
        List<String> names2 = Arrays.asList("Alice", "Bob", "Charlie");
        names2.stream().sorted().forEach(System.out::println);                // Prints Alice, Bob, Charlie

        // 4. Custom sorting
        names2.stream()
                .sorted((s1, s2) -> s2.compareTo(s1))                           // Sort in reverse order
                .forEach(System.out::println);                                  // Prints Charlie, Bob, Alice
    }
}
