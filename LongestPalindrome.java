package leecode;

public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        String longest = "";
        for(int i=0;i<s.length();i++){
            int m = i;
            int n = i;
            while(m>=0&&n<s.length()&&s.charAt(m)==s.charAt(n)){
                longest = s.substring(m,n+1).length()>longest.length()?s.substring(m,n+1):longest;
                m--;
                n++;
            }
            m = i;
            n = i+1;
            while(m>=0&&n<s.length()&&s.charAt(m)==s.charAt(n)){
                longest = s.substring(m,n+1).length()>longest.length()?s.substring(m,n+1):longest;
                m--;
                n++;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
    }
}
