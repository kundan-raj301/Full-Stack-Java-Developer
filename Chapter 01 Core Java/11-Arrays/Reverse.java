import java.util.Scanner;
public class Reverse{

    public static void reverse(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Declare and initialize the array
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the function to find the largest element
        reverse(arr);
        System.out.println("Reverse arr: ");
        for(int i = 0; i< n;i++){
            System.out.println(arr[i]);
        }
        

        sc.close();
        
    }
}