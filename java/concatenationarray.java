class concatenationarray {
    public int[] getConcatenation(int[] nums) {
     int n = nums.length;
     int [] ans = new int[2* nums.length];

     for(int i=0;i<n;i++){
        ans[i] = nums[i];
        ans[i+n] = nums[i];
     }   
     return ans;
    }

    public static void main(String[] args) {
        concatenationarray sol = new concatenationarray();
        int[] nums = {1, 2, 3};
        int[] result = sol.getConcatenation(nums);
        
        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}