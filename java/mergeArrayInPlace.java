public class mergeArrayInPlace {
     public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1 ;
        int j = n-1;
        int last = m+n-1;

        while(j>=0){
            if(i>=0 && nums1[i] > nums2[j]){
                nums1[last--] = nums1[i--];
            }else{
                nums1[last--] = nums2[j--];
            }
        }
    }
    public static void main(String[] args) {
        mergeArrayInPlace sol = new mergeArrayInPlace();

        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        sol.merge(nums1, m, nums2, n);

        for(int num : nums1){
            System.out.print(num + " ");
        }
    }
}
