//For inbuiltSort:
/*  
    Ascending order: 
        import java.util.Arrays
        Arrays.sort(array_name) // O(nlogn)
        OR
        Arrays.sort(array_name,startingIndex, endingIndex)

    Descending Order:
        import java.util.Collections
        Arrays.sort(array_name, Collections.reverseOrder())
        Or
        Arrays.sort(array_name, si, ei, Collections.reverseOrder())

        Note : it works only object So we use Integer for the collections


 */

import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort {

    public static void main(String[] args) {
        Integer arr[] = {1,458,4,5,7};  // Input array
          // Perform inbuilt sort on the array

        Arrays.sort(arr);

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Arrays.sort(arr,Collections.reverseOrder());
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
