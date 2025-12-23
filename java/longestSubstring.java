import java.util.Arrays;

public class longestSubstring {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 ||strs == null){
            return "";
        }

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length-1];

        int i = 0 ;
        while(i < first.length() && i  < last.length() && first.charAt(i) == last.charAt(i)){
            i++;
        }// in this first and last strings are least similar 

        return first.substring(0 , i);
    }
}

// 2-nd Approach
 
/* public
    class longestSubstring {
        public String longestCommonPrefix(String[] strs) {
            if(strs.length == 0 ||strs == null){
                return "";
            }
    
            String prefix = strs[0];
    
         in this shrink prefix until it matches current string

            for(int i = 1 ; i < strs.length ; i++){
                while(!strs[i].startsWith(prefix)){/
                    prefix = prefix.substring(0 , prefix.length() - 1);
                    if(prefix.isEmpty()){
                        return "";
                    }
                }
            }
    
            return prefix;
        }
    }*/