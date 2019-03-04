package leecode;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        int len = s.length();

        String sub = "";
        for(int i=0;i<len;i++){
            String x = findsub(i,i,len,s);
            String y = findsub(i,i+1,len,s);
            if(sub.length()<x.length())sub=x;
            if(sub.length()<y.length())sub=y;
        }
        System.out.println(sub);
    }
    public static String findsub(int i,int j,int len,String s){
        String tmpsub = "";
        while(i>=0&&j<len){
            if(s.charAt(i)!=s.charAt(j))break;
            tmpsub = s.substring(i,j+1);
            i--;
            j++;
        }
        return tmpsub;
    }
}
