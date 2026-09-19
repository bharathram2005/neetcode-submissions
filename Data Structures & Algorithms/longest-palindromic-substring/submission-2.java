class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1){
            return s;
        }

        String longestPalindrome = "";
        for (int i = 0; i < s.length(); i++){
            for (int j = i+1; j <= s.length(); j++){
                String substring = s.substring(i, j);
                if(isPalindrome(substring) && 
                substring.length() > longestPalindrome.length()){
                    longestPalindrome = substring;
                }
            }
        }
        return longestPalindrome;
    }

    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        while (j >= i){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}
