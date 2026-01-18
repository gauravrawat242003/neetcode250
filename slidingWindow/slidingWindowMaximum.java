package slidingWindow;
public class slidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] output = new int[n-k+1];
        for(int i =0 ;i < n-k+1;i++){
            int maxi = Integer.MIN_VALUE;
            for(int j =i ; j < i+k ;j++){
                maxi = Math.max(maxi , nums[j]);
            }
            output[i] = maxi;
        }
        return output;
    }
}
