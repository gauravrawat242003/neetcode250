package binarysearch;

import java.util.Scanner;

public class peakEl {
    
    public static int findPeakElement(int[] nums){
        int n = nums.length;

        if(n==1)return 0;
        if(nums[0] > nums[1])return 0;
        if(nums[n-1] > nums[n-1])return n-1;

        int low = 1 , high = n-1;

    }

    public static void main(String[] args) {
        int[] arr = new int[5];

       Scanner sc = new Scanner(System.in);

       for(int i =0 ;i<5;i++){
       arr[i]  = sc.nextInt() ;
       } 

       int unique = findPeakElement(arr);

       System.out.println(unique);
       sc.close();;
    }
}
