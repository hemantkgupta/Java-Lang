import java.util.function.Function;
import java.util.function.Predicate;

public class Predicate_And_Function {
    public static void main(String[] args) {

        // 1. Predicate
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(4));                         // Output: true

        // 2. Function
        Function<String, Integer> stringLength = str -> str.length();
        System.out.println(stringLength.apply("Hello"));            // Output: 5
    }
}
