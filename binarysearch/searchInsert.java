package binarysearch;

public class searchInsert {
    public int searchInsert1(int[] nums, int target) {
        int n = nums.length;
        int l = 0 , h = n-1;
        int ans = n;

        while(l<=h){
            int mid = (l+h)/2;

            if(nums[mid] == target){
               return mid;
            }else if(nums[mid] > target){
                ans = mid;
                h = mid - 1;
            }else{
                l = mid +1;
            }
        }
        return ans;    
    }
    public static void main(String[] args) {
        searchInsert sol = new searchInsert();

        int[] nums = {1,3,5,6};
        int target = 5;

        int ans = sol.searchInsert1(nums, target);

        System.out.println(ans);
    }
}

