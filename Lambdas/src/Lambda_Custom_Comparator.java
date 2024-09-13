import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda_Custom_Comparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob");
        Collections.sort(names, (a, b) -> a.compareTo(b));              // Sort names in ascending order
        names.forEach(System.out::println);
    }

}
