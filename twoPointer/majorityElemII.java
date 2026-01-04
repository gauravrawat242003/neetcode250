import java.util.ArrayList;
import java.util.List;

public class majorityElemII {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        int elem1 = -1 , elem2 = -1, cnt1 = 0, cnt2 = 0;

        for(int i=0 ;i< n ;i++){
            if(nums[i] == elem1){
                cnt1++;
            }else if(nums[i] == elem2){
                cnt2++;
            }else if(cnt1 == 0){
                elem1 = nums[i];
                cnt1=1;
            }else if(cnt2 == 0){
                elem2 = nums[i];
                cnt2 =1;
            }else{
                cnt1--;
                cnt2--;
            }
        }

        cnt1=0; cnt2 =0;
        for(int num : nums){
            if(num == elem1){
                cnt1++;
            }else if(num == elem2){
                cnt2++;
            }
        }

        ArrayList<Integer> res = new ArrayList<>();

            if(cnt1 > n/3)res.add(elem1);
            if(cnt2 > n/3)res.add(elem2);

            return res;
    }
    public static void main(String[] args) {
        majorityElemII sol = new majorityElemII();

        int[] nums = {3,2,3};

        List<Integer> ans = sol.majorityElement(nums);

        System.out.println(ans);
    }
}

