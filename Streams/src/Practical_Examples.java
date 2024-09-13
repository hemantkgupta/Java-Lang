import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Practical_Examples {
    public static void main(String[] args) {
        // 1. Product of All Elements
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int product = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(product);  // Output: 120 (1 * 2 * 3 * 4 * 5)

        // 2. Finding the Maximum Element
        List<Integer> numbers2 = Arrays.asList(3, 5, 1, 7, 9);
        Optional<Integer> max = numbers2.stream().reduce(Integer::max);
        max.ifPresent(System.out::println);  // Output: 9


        // 3. Counting Characters in Strings
        List<String> words = Arrays.asList("Java", "Streams", "are", "powerful");
        int totalChars = words.stream().reduce(0,
                (total, word) -> total + word.length(),
                Integer::sum);

        System.out.println(totalChars);  // Output: 23 (length of all words combined)
    }
}
