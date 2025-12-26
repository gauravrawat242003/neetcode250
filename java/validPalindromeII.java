//two pointer optimal
class validPalindromeII {
    public boolean validPalindrome(String s) {
        int l =0 ,r = s.length()-1;

        while(l<r){
            if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }else{
                return isPalindrome(s , l+1 ,r) || isPalindrome(s , l ,r-1);
            }
        }
        return true;
    }

     private boolean isPalindrome(String s , int l , int r){
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        validPalindromeII sol = new validPalindromeII();

        String s = "abca";

        System.out.println(sol.validPalindrome(s));
    }
}
// Time Complexity: O(N) where N is length of string
// Space Complexity: O(1)


//brute force
class Solution {
    public boolean validPalindrome(String s) {

        if (isPalindrome(s)) {
            return true;
        }

        // Delete one character at each position
        for (int i = 0; i < s.length(); i++) {
            String newStr = s.substring(0, i) + s.substring(i + 1);
            if (isPalindrome(newStr)) {
                return true;
            }
        }

        return false;
    }

    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
// Time Complexity: O(N^2) where N is length of string
// Space Complexity: O(N)