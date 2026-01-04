public class removeDuplicateTP {
      public int removeDuplicates(int[] nums) {
        int n = nums.length;

        int j =0 ;

        for(int i =0 ;i < n ;i++){
            if(nums[j] != nums[i]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        removeDuplicateTP sol = new removeDuplicateTP();

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int k = sol.removeDuplicates(nums);

        System.out.println("Length after removing duplicates: " + k);
        System.out.print("Array after removing duplicates: ");
        for(int i = 0; i < k; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
