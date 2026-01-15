package slidingWindow;

import java.util.HashMap;

public class longestRepChReplacement {
        public int characterReplacement(String s, int k) {
        int n = s.length();
        HashMap<Character ,Integer> mp = new HashMap<>();
        int l = 0, r=0 ,maxFreq = 0 , maxLen = 0;

        while(r < n){
            char ch = s.charAt(r); 
            mp.put(ch , mp.getOrDefault(ch,0)+1);
            maxFreq = Math.max(maxFreq , mp.get(ch));

            if((r-l +1) - maxFreq > k){
                char leftch = s.charAt(l);
                mp.put(leftch , mp.get(leftch)-1);
                l++;
            }

            maxLen = Math.max(maxLen , r - l +1);
            r++;
        }
        return maxLen;
    }
}
