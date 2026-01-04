import java.util.HashMap;
import java.util.Map;

public class subarraySumEqK {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer>mp = new HashMap<>();
        int sum= 0;
        int cnt =0;
        mp.put(0,1);
        for(int num : nums){
            sum += num;

            int diff = sum - k;

           cnt += mp.getOrDefault(diff , 0);

           mp.put(sum , mp.getOrDefault(sum , 0)+1); 
        }
        return cnt;
    }
}
