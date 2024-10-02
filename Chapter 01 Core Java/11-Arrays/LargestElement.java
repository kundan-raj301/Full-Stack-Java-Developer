import java.util.Scanner;

public class LargestElement{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Declare and initialize the array
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Call the function to find the largest element
        int largestElement = largestElement(arr);
        System.out.println("The largest element in the array is: " + largestElement);

        scanner.close();
    }

    // Function to find the largest element in the array
    public static int largestElement(int[] arr) {
        int max = arr[0];  // Initialize `max` with the first element

        // Traverse the array to find the maximum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // Update `max` if a larger element is found
            }
        }
        return max;
    }
}
