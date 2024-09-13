import java.util.function.Function;

public class Higher_Order_Functions {
    public static void main(String[] args) {

        // A higher-order function is a function
        // that takes one or more functions as parameters or returns a function as a result.
        Function<Integer, Integer> square = x -> x * x;
        Function<Integer, Integer> doubleValue = x -> x * 2;

        // Compose functions: First double, then square
        Function<Integer, Integer> composed = doubleValue.andThen(square);

        System.out.println(composed.apply(3));                              // Output: 36 (first 3*2 = 6, then 6*6 = 36)
    }
}
