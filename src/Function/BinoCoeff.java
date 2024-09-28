package Function;

import java.util.Scanner;

public class BinoCoeff {
	
	public static int fact(int n) {
		// Handle edge case for 0! = 1
        if (n == 0) return 1;
        
        int prod = 1;
        for (int i = 1; i <= n; i++) {
            prod = prod * i;
        }
        return prod;
	}
	public static int BinomialCoefficient(int n,int r) {
		
		int result = fact(n)/(fact(r)*fact(n-r));
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		int result = BinomialCoefficient(n,r);
		
		System.out.println(result);
		
		sc.close();
	}

}
