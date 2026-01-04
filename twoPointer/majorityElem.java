public class majorityElem {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int val = nums[0];
        int cnt =1;
        for(int i =1 ;i<n ;i++){
            if(nums[i] == val){
                cnt++;
            }else{
                if(cnt>0){
                    cnt--;
                }else{
                    cnt=1;
                    val = nums[i];
                }
            }
        }

        for(int i=0 ;i<n ;i++){
            if(nums[i] == val){
                cnt++;
            }
        }
    
        if(cnt > n/2){
            return val;
        }
        return -1;
    }

    public static void main(String[] args) {
        majorityElem sol = new majorityElem();

        int[] nums = {2,2,1,1,1,2,2};

        int ans = sol.majorityElement(nums);

        System.out.println(ans);
    }
}

// Time Complexity: O(N) where N is number of elements in the array
// Space Complexity: O(1)

