import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Creating_Streams {
    public static void main(String[] args) {
        // 1. From Collections
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Stream<String> stream1 = names.stream();
        stream1.forEach(System.out::println);

        // 2. From Arrays
        Stream<String> stream2 = Stream.of("Alice", "Bob", "Charlie");
        stream2.forEach(System.out::println);

        // 3. Infinite Streams (Generate or Iterate)
        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 2).limit(10); // 0, 2, 4, ..., 18
        infiniteStream.forEach(System.out::println);

    }
}
