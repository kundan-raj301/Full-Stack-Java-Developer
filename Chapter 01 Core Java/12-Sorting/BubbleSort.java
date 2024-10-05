
public class BubbleSort {
    // Function to perform Bubble Sort
    public static void bubbleSort(int arr[]) {
        int n = arr.length;

        // Outer loop: Control number of passes
        for (int pass = 0; pass < n - 1; pass++) {
            int swap = 0;  // To keep track of whether any swap happened

            // Inner loop: Traverse through unsorted part of the array
            for (int i = 0; i < n - 1 - pass; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Swap arr[i] and arr[i+1] if they are in the wrong order
                    swap++;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            // If no swaps occurred in this pass, break the loop (array is sorted)
            if (swap == 0) break;
        }
    }

    // Main function to test Bubble Sort
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 8};  // Input array
        bubbleSort(arr);  // Perform bubble sort on the array

        // Print the sorted array
        System.out.print("Sorted arr : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

