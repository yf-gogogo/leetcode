package leecode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return "";
        String s = strs[0];
        for(String str:strs){
            int end = 0;
            while(end<s.length()&&end<str.length()){
                if(s.charAt(end)!=str.charAt(end))break;
                end++;
            }
            if(end == 0)return "";
            s = s.substring(0,end);
        }
        return s;
    }
}
