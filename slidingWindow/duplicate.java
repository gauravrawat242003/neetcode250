package slidingWindow;

import java.util.*;
//using hasmap
public class duplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>mpp = new HashMap<>();

        for(int i = 0 ;i < nums.length ;i++){
            if(mpp.containsKey(nums[i]) && i - mpp.get(nums[i]) <= k){
                return true;
            }

            mpp.put(nums[i],i);
        }
        return false;
    }
}

//tc : O(n)
//sc : O(n)


//using hashset
public class dulicateII{
      public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer>st = new HashSet<>();

        int l = 0 , r = 0;
        while(r < n){
            if(r - l > k ){
                st.remove(nums[l]);
                l++;
            }

            if(st.contains(nums[r])){
                return true;
            }

            st.add(nums[r]);
            r++;
        }
        return false;
    }
}

//tc : O(n)
//sc : O(k) space complexity is O(k) because at any point in time, the sliding window contains at most k elements.