import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Terminal_Operations {
    public static void main(String[] args) {
        // 1. collect()
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        uppercaseNames.forEach(System.out::println);

        // 2. reduce()
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);      // Adds all numbers, result is 15
        System.out.println(sum);

        // 3. forEach()
        List<String> names2 = Arrays.asList("Alice", "Bob", "Charlie");
        names2.stream().forEach(System.out::println);                       // Prints each name

        // 4. count()
        List<String> names3 = Arrays.asList("Alice", "Bob", "Charlie");
        long count = names3.stream().filter(n -> n.length() >= 5).count();   // Counts names with 5 or more characters
        System.out.println(count);


    }
}
