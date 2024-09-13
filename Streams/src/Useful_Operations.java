import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Useful_Operations {

    public static void main(String[] args) {
        // 1. distinct()
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 4);
        numbers.stream().distinct().forEach(System.out::println);                 // Prints 1, 2, 3, 4

        // 2. limit()
        Stream<Integer> infiniteStream1 = Stream.iterate(0, n -> n + 1);
        infiniteStream1.limit(5).forEach(System.out::println);             // Prints first 5 numbers: 0, 1, 2, 3, 4

        // 3. skip()
        Stream<Integer> infiniteStream2 = Stream.iterate(0, n -> n + 1);
        infiniteStream2.skip(5).limit(5).forEach(System.out::println);   // Skips first 5, then prints 5, 6, 7, 8, 9
    }
}
