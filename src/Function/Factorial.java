package Function;
import java.util.Scanner;

public class Factorial {
    
    public static int fact(int n) {
        // Handle edge case for 0! = 1
        if (n == 0) return 1;
        
        int prod = 1;
        for (int i = 1; i <= n; i++) {
            prod = prod * i;
        }
        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to find its factorial: ");
        int n = sc.nextInt();
        
        // Input validation: check for negative numbers
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int res = fact(n);
            System.out.println("The factorial of " + n + " is: " + res);
        }
        
        // Close the scanner object
        sc.close();
    }
}

