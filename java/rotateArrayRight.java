//optimal solution with O(1) space complexity and O(n) time complexity
public class rotateArrayRight {
       public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0) return;

        k = k % n;
        reverse(nums, 0 , n-1);
        reverse(nums , 0, k-1);
        reverse(nums, k , n-1);
       
    }

    private void reverse(int[] nums, int i ,int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}

//brute force solution with O(n) space complexity and O(n) time complexity

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] temp = new int[n];

        for(int i =0 ;i<n ;i++){
            temp[(i+k)%n] = nums[i];
        } 

        for(int i =0 ;i<n;i++){
            nums[i] = temp[i];
        }
    }
    public static void main(String[] args) {
        rotateArrayRight solution = new rotateArrayRight();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        solution.rotate(nums, k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
