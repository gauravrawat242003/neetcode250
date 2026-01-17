package slidingWindow;

import java.util.HashMap;
import java.util.Map;
// Time Complexity: O(N^2) where N is the length of string s
// Space Complexity: O(M) where M is the number of unique characters in string t

public class minimumWindowSubString {
    public String minWindow(String s, String t) {
        if(t.isEmpty())return "";

        Map<Character,Integer> countT = new HashMap<>();
        for(char c :t.toCharArray()){
            countT.put(c , countT.getOrDefault(c, 0)+1);
        }

        int[] res = {-1,-1};
        int resLen = Integer.MAX_VALUE;

        for(int i =0 ; i<s.length() ; i++){
            Map<Character,Integer> countS = new HashMap<>();
            for(int j =i ; j<s.length(); j++){
                countS.put(s.charAt(j) , countS.getOrDefault(s.charAt(j), 0)+1);

                boolean flag = true;
                for(char c : countT.keySet()){
                    if(countS.getOrDefault(c,0) < countT.get(c)){
                        flag = false;
                        break;
                    }
                }

                if(flag && (j-i+1) < resLen){
                    resLen = j-i+1;
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0] ,res[1]+1);
    }
}


//optimal approach
// Time Complexity: O(N) where N is the length of string s
// Space Complexity: O(M) where M is the number of unique characters in string t
class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty())return "";

        Map<Character,Integer> countT = new HashMap<>();
        Map<Character,Integer> window = new HashMap<>();
        for(char c : t.toCharArray()){
            countT.put(c , countT.getOrDefault(c, 0)+1);
        }

        int need  = countT.size() , have = 0;
        int[] res = {-1,-1} ;
        int resLen = Integer.MAX_VALUE;
        int l =0;

       for(int r=0 ;r<s.length() ;r++){
        char c = s.charAt(r);
        window.put(c , window.getOrDefault(c,0)+1);

        if(countT.containsKey(c) && window.get(c) == countT.get(c)){
            have++;
        }

        while(need == have){
            if((r-l+1) < resLen){
                resLen = r-l+1;
                res[0] = l;
                res[1] = r;
            }
            char leftChar = s.charAt(l);
            window.put(leftChar, window.get(leftChar)-1);
            if(countT.containsKey(leftChar) && window.get(leftChar) < countT.get(leftChar)){
                have--;
            }
            l++; 
        }
       }
        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0] ,res[1]+1);
    }
}
