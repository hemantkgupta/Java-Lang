import java.util.function.Function;

public class Composition_Of_Functions {

    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x * x;
        Function<Integer, Integer> addTwo = x -> x + 2;

        // You can compose functions using methods like andThen() and compose()
        // to create complex behaviors from simpler functions.

        Function<Integer, Integer> addThenSquare = addTwo.andThen(square);          // (x + 2)²
        Function<Integer, Integer> squareThenAdd = addTwo.compose(square);          // (x² + 2)

        System.out.println(addThenSquare.apply(3));                             // Output: 25
        System.out.println(squareThenAdd.apply(3));                             // Output: 11
    }
}
