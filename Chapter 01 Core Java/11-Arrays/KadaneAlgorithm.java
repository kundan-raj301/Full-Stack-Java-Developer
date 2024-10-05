import java.util.Scanner;
public class KadaneAlgorithm{
    public static int kadaneAlgorithm(int nums[]){
        int n = nums.length;

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int  i = 0; i< n;i++){
            currSum = currSum + nums[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum , maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args){
        //int nums[] = {1,-2,6,-1,3};
        int nums[] = {-2,-3,4,-1,-2,1,5,-3};
        int maxSum = kadaneAlgorithm(nums);
        System.out.println("Maximum subarray sum is :" + maxSum);
    }
}