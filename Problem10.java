import java.util.Scanner;

/**
 * This class contains a method to calculate the greatest common divisor (GCD) of two numbers using recursion.
 * It takes user input for two numbers, calculates their GCD, and outputs the result.
 */
public class Problem10 {

    /**
     * Main method to read user input, call the gcd method, and output the result.
     * Time Complexity: O(log(min(a, b)))
     * - The Euclidean algorithm has logarithmic time complexity.
     * - The recursive calls reduce the size of the inputs by a factor of approximately 2 each time.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextByte();
        int b = sc.nextByte();

        // Output the result of the GCD function
        System.out.println("GCD(" + a + ", " + b + ") = " + gcd(a, b));
    }

    /**
     * Function to calculate the GCD of two numbers using recursion (Euclidean Algorithm).
     * Time Complexity: O(log(min(a, b)))
     * - The Euclidean algorithm has logarithmic time complexity.
     * - The recursive calls reduce the size of the inputs by a factor of approximately 2 each time.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The GCD of 'a' and 'b'.
     */
    public static int gcd(int a, int b) {
        // Base case: if b is 0, return a (since GCD(a, 0) = a)
        if (b == 0) {
            return a;
        }
        // Recursive case: otherwise, recursively call gcd with (b, a % b)
        else {
            return gcd(b, a % b);
        }
    }
}
