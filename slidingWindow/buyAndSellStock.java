package slidingWindow;

public class buyAndSellStock {
    static int maxProfit(int[] nums) {
        int n = nums.length;

        int l =0 , r =0;
        int maxProfit = 0;

        while(r < n){
            if(nums[r] < nums[l]){
                maxProfit = Math.max(maxProfit , nums[r] - nums[l]);
            }else{
                l = r;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
