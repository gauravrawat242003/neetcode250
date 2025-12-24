public class removeElement {
    public static int removeElements(int[] nums, int val) {
        int n = nums.length;

        int k =0;

        for(int i =0 ;i<n ;i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3,4,5,3,6};
        int val = 3;

        int k = removeElements(nums , val);

        System.out.println("New length: " + k);
        System.out.print("Modified array: ");
        for(int i =0 ;i<k ;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
