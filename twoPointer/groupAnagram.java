import java.util.*;
// by sorting each string and using it as a key in hashmap
class groupAnagram {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for (String str : strs) {
            char[] ch = str.toCharArray();

            Arrays.sort(ch);

            String key = new String(ch);

            // if key not present, create new list
            if (!mp.containsKey(key)) {
                mp.put(key, new ArrayList<>());
            }

       
            mp.get(key).add(str);
        }

        for (List<String> grp : mp.values()) {
            result.add(grp);
        }

        return result;
    }

    public static void main(String[] args) {
        groupAnagram sol = new groupAnagram();

        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};

        List<List<String>> ans = sol.groupAnagrams(strs);

        System.out.println(ans);
    }
}

// Time Complexity: O(N * K log K) where N is number of strings and K is max length of a string
// Space Complexity: O(N * K) for hashmap storage

// Alternate Approach: Using character count as key

class groupAnagrama{
    public List<List<String>> grpAnagram(String[] strs){
        HashMap<String,List<String>> mpp = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for(String str : strs){
            int[] freq = new int[26];

            for(char ch : str.toCharArray()){
                freq[ch - 'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();
            for(int i=0 ;i<26 ;i++){
               if(freq[i] > 0){
                 char c = (char)(i + 'a');
                 keyBuilder.append(c).append(freq[i]);
               }
            }            

            String key = keyBuilder.toString();

            if(!mpp.containsKey(key)){
                mpp.put(key,new ArrayList<>());
            }
            mpp.get(key).add(str);
        }

        result.addAll(mpp.values());
        return result;
    }
}
// Time Complexity: O(N * K) where N is number of strings and K is max length of a string
// Space Complexity: O(N * K) for hashmap storage
