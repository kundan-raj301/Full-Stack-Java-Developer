public class SelectionSort {
    // Function to perform Selection Sort
    public static void selectionSort(int arr[]) {
        int n = arr.length;

        // Outer loop: Control the sorted part of the array
        for (int i = 0; i < n - 1; i++) {
            int miniPos = i;  // Assume the first element of the unsorted part as minimum

            // Inner loop: Find the index of the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {  // Corrected condition (j < n)
                if (arr[j] < arr[miniPos]) {
                    miniPos = j;
                }
            }

            // Swap the minimum element found with the first element of the unsorted part
            int temp = arr[i];
            arr[i] = arr[miniPos];
            arr[miniPos] = temp;
        }
    }

    // Main function to test Selection Sort
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 8};  // Input array
        selectionSort(arr);  // Perform selection sort on the array

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
