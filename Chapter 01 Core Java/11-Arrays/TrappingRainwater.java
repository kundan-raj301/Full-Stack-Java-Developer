import java.util.*;

public class TrappingRainwater {
    // Function to calculate the total amount of trapped rainwater
    public static int trappingRainwater(int height[]) {
        int n = height.length;

        // Step 1: Calculate the left max boundary array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Step 2: Calculate the right max boundary array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Step 3 & 4: Calculate the trapped water at each index
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            // Water level at current index is determined by the minimum of left and right boundaries
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // Calculate the trapped water at index `i` and add to the total
            trappedWater += (waterLevel - height[i]);
        }

        return trappedWater; // Return the total trapped water
    }

    // Main function to test the code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Input the height array
        int height[] = new int[n];
        System.out.println("Enter the elements of the height array:");
        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }

        // Calculate and display the total trapped water
        int totalTrappedWater = trappingRainwater(height);
        System.out.println("Total trapped water: " + totalTrappedWater);

        scanner.close();
    }
}
