package leecode;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(" bbb a"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int m = 0,max = 0;
        for(int i=0;i<len;i++){
            int n = i;
            boolean flag = false;
            int j;
            for(j=m;j<n;j++){
                if(s.charAt(j)==s.charAt(i)){
                    flag = true;
                    break;
                }
            }
            if(flag){
                m = j+1;
            }
            max = max<n+1-m?n+1-m:max;
        }
        return max;
    }
}
