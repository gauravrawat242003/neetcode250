import java.util.HashMap;

public class twosum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int res = target - nums[i];

            if(mp.containsKey(res)){
                return new int[]{mp.get(res) , i};
            }
            mp.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        twosum ts = new twosum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = ts.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]); // Output: Indices: 0, 1
    }
}
