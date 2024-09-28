package Function;

import java.util.*;

public class OptimizedBinoCoeff {
	// Optimized method to compute binomial coefficient without calculating factorials
	
	public static long binomialCoefficient(int n, int r) {
        // Handle edge cases
        if (r > n) return 0;  // Not possible to choose more items than available
        if (r == 0 || r == n) return 1;  // Only one way to choose 0 or n items

        // Optimization: nCr is symmetric, nCr = nC(n-r)
        if (r > n - r) {
        	r = n - r;
        }

        long result = 1;
        for (int i = 0; i < r; i++) {
            result = result * (n - i);
            result = result / (i + 1);
        }
        return result;
    }

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();

        // Calculate the binomial coefficient using the optimized method
        long result = binomialCoefficient(n, r);
        System.out.println("Binomial Coefficient (" + n + " choose " + r + ") = " + result);

        sc.close();
    }

}
