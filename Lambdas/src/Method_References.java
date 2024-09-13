import java.util.Arrays;
import java.util.List;

public class Method_References {
    public static void main(String[] args) {

        // Syntax ClassName::methodName
        List<String> names = Arrays.asList("John", "Alice", "Bob");
        names.forEach(System.out::println);  // Method reference to System.out.println

        /*
        Types of Method References:
        1. Static method reference: ClassName::staticMethod
	    Example: Math::abs

	    2. Instance method reference of a particular object: instance::instanceMethod
	    Example: System.out::println

        3. Instance method reference of an arbitrary object of a particular type: ClassName::instanceMethod
	    Example: String::toLowerCase

        */
    }
}
