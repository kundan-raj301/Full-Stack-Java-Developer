import java.util.*;

public class BinarySearch{
    public static int binarySearch(int[] nums, int target) {
        // Write your code here.
        int n = nums.length;

        int left = 0;
        int right = n-1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }

            else if(nums[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Taking array elements input
        System.out.println("Enter " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Taking the target element input
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        // Calling the search function
        int index = binarySearch(arr, target);

        // Printing the result
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}