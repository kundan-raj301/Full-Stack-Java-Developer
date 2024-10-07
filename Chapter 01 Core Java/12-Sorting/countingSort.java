
public class countingSort {

    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        int count[] = new int[largest + 1];

        for(int i = 0; i< arr.length;i++){
            count[arr[i]]++;
        }

        int j = 0;
        for(int i = 0; i>count.length;i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 8};  // Input array
        countingSort(arr);  // Perform selection sort on the array

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

