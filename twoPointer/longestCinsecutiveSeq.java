import java.util.Arrays;

public class longestCinsecutiveSeq {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if(n == 0){
            return 0;
        }

        Arrays.sort(nums);

        int curr = nums[0] , cnt = 0 ,i =0;
        int maxCnt = 0;

        while(i<n){
            if(curr != nums[i]){
                curr = nums[i];
                cnt = 0;
            }

            while(i<n && curr == nums[i]){
                i++;
            }

            cnt++;
            curr++;

            maxCnt = Math.max(maxCnt , cnt);
        }
        return maxCnt;
    }
    public static void main(String[] args) {
        longestCinsecutiveSeq sol = new longestCinsecutiveSeq();

        int[] nums = {100, 4, 200, 1, 3, 2};

        int longestSeq = sol.longestConsecutive(nums);

        System.out.println("Length of longest consecutive sequence: " + longestSeq);
    }
}

// 2nd approach using HashSet


/*import java.util.HashSet;;
public class longestCinsecutiveSequenceHashSet {
    public int longestConsecutiveHs(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int maxLen = 0;

        for(int num : nums){
            if(!set.contains(num - 1)){
                int currNum = num;
                int currLen = 1;

                while(set.contains(currNum + 1)){
                    currNum++;
                    currLen++;
                }

                maxLen = Math.max(maxLen , currLen);
            }
        }

        return maxLen;
    }

*/

