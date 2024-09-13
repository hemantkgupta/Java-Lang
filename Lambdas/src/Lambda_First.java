import java.util.Arrays;
import java.util.List;

public class Lambda_First {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(n -> System.out.println(n));            // Print each number
    }


}