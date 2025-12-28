public class mergeStringAlternate {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        if(n==0)return word2;
        if(m==0)return word1;

        StringBuilder sb = new StringBuilder();

       int i = 0;
       int j = 0;

       while(i<n && j<m){
        sb.append(word1.charAt(i)).append(word2.charAt(j));
        i++;j++;
       }

       while(i<n){
        sb.append(word1.charAt(i++));
       }

       while(j<m){
        sb.append(word2.charAt(j++));
       }

       return sb.toString();
    }
    public static void main(String[] args) {
        mergeStringAlternate sol = new mergeStringAlternate();

        String word1 = "abc";
        String word2 = "pqrstu";

        String ans = sol.mergeAlternately(word1, word2);

        System.out.println(ans);
    }
}


// Time Complexity: O(N+M) where N and M are lengths of word1 and word2