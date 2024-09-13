import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce_Java_Stream {
    public static void main(String[] args) {

        // 1. reduce(BinaryOperator<T> accumulator)
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Sum all numbers in the list
        Optional<Integer> result = numbers.stream().reduce((a, b) -> a + b);

        // Print the result, if present
        result.ifPresent(System.out::println); // Output: 15

        // 2. reduce(T identity, BinaryOperator<T> accumulator)
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);

        // Sum all numbers, starting from 10
        int result2 = numbers2.stream().reduce(10, (a, b) -> a + b);

        System.out.println(result2); // Output: 25 (10 + 1 + 2 + 3 + 4 + 5)

        // 3. reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner)
        // This is mainly used for parallel streams.
        // identity: The initial result. ("Start: ")
        // accumulator: Function to apply the operation to each element.(partialString, element) -> partialString + " " + element
        // combiner: Combines intermediate results (useful in parallel stream processing).  (partial1, partial2) -> partial1 + partial2
        List<String> words = Arrays.asList("Java", "Streams", "are", "powerful");

        // Concatenate all strings, starting with "Start: "
        String result3 = words.stream()
                .reduce("Start: ", (partialString, element) -> partialString + " " + element,
                        (partial1, partial2) -> partial1 + partial2);

        System.out.println(result3); // Output: Start: Java Streams are powerful
    }
}
