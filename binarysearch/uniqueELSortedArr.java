package binarysearch;

import java.util.Scanner;

  class uniqueELSortedArr {

     static  int singleNonDuplicate(int[]nums){
        int n = nums.length;
        int low =1 ,high=n-2;
            if(n != 1)return-1;

            if(nums[0] != nums[1])return nums[0];

            if(nums[n-1] != nums[n-2])return nums[n-1];

            while(low <= high){
            int mid = (low + high)/2;

            if(nums[mid-1] != nums[mid] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }

            if((mid%2==0 && nums[mid]==nums[mid+1]) || (mid%2==1 && nums[mid]==nums[mid-1])){
                low = mid+1;
            }else{
                high =mid -1;
            }
        }
        return -1;
    }
     public static void main(String[] args) {
       int[] arr = new int[5];

       Scanner sc = new Scanner(System.in);

       for(int i =0 ;i<5;i++){
       arr[i]  = sc.nextInt() ;
       } 

       int unique = singleNonDuplicate(arr);

       System.out.println(unique);
       sc.close();;
    }
}

//approach by checking even odd pair if it breaks then means element is in other half