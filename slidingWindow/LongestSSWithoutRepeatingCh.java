package slidingWindow;
import java.util.*;
//brute force -> tc : O(n^2) sc : O(1)
public class LongestSSWithoutRepeatingCh {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;

        for(int i = 0 ; i < n ; i++){
            HashSet<Character>set = new HashSet<>();
            for(int j = i ; j < n ; j++){
                if(set.contains(s.charAt(j))){
                    break;
                }else{
                    set.add(s.charAt(j));
                    maxLen = Math.max(maxLen , j - i + 1);
                }
            }
        }
        return maxLen;
    }
}

//optimal approach (using hashset)-> tc : O(n) sc : O(min(m,n)) where m is the size of charset

class Solution1 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> st = new HashSet<>();
        int maxi = 0;
        int l = 0 , r =0;

        while(r < n){
            while(st.contains(s.charAt(r))){
                st.remove(s.charAt(l));
                l++;
            }
            st.add(s.charAt(r));
            maxi = Math.max(maxi , r-l+1);
            r++;
        }
        return maxi;
    }
}

//optimal approach (using hashmap) -> tc : O(n) sc : O(min(m,n)) where m is the size of charset
class Solution2 {
    public int lengthLongestSubstring(String s) {
       int n = s.length();
       HashMap<Character ,Integer> mp = new HashMap<>();
       int maxLen =0 ,l =0 ,r =0;
       while(r<n){
        if(mp.containsKey(s.charAt(r))){
            l = Math.max(mp.get(s.charAt(r))+1 , l);
        }
        mp.put(s.charAt(r) , r);
        maxLen = Math.max(maxLen , r - l + 1);
        r++;
       }
       return maxLen;
    }
}