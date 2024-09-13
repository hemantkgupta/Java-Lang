import java.util.Arrays;
import java.util.List;

public class Parallel_Streams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Parallel streams automatically divide the tasks among multiple threads
        int sum = numbers.parallelStream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)               // Convert Integer to int
                .sum();                         // Sum the filtered numbers

        System.out.println(sum);                // Prints the sum of even numbers: 30
    }
}
