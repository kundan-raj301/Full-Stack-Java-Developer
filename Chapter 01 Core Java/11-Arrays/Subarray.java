import java.util.*;
public class Subarray {
    // Function to print all subarrays of the given array
    public static void printAllSubarrays(int[] arr) {
        int n = arr.length;

        // Loop to choose the starting point of the subarray
        for (int start = 0; start < n; start++) {
            // Loop to choose the ending point of the subarray
            for (int end = start; end < n; end++) {
                // Print elements from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();  // Print new line after each subarray
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Initialize the array
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Call the function to print all subarrays
        printAllSubarrays(arr);

        scanner.close();
    }
}
