package leecode;

public class Atoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("   4193 with words"));
    }
    public static int myAtoi(String str) {
        String tstr = str.trim();
        char[] cstr = tstr.toCharArray();
        boolean f = true;
        int positive = 1;
        long result = 0;
        for(int i=0;i<cstr.length;i++){
            if(f&&cstr[i]=='-'){
                positive = -1;
                f = false;
                continue;
            }
            if(f&&cstr[i]=='+'){
                f = false;
                continue;
            }

            if(cstr[i]>='0'&&cstr[i]<='9'){
                f = false;
                result = result*10+(cstr[i]-'0');
                if(result*positive>0x7fffffff)return 0x7fffffff;
                if(result*positive<0x80000000)return 0x80000000;
            }else{
                return (int)result*positive;
            }
        }
        return (int)result*positive;
    }
}
