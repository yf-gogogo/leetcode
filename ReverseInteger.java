package leecode;

public class ReverseInteger {
    public static int reverse(int x) {
//        if(x==0x80000000)return 0;
//        int positive = x>=0?1:-1;
//        x =  Math.abs(x);
//        StringBuilder sb = new StringBuilder(String.valueOf(x));
//        StringBuilder rsb = sb.reverse();
//        Long result = Long.parseLong(rsb.toString())*positive;
//        if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE)return 0;
//        return result.intValue();
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }
}
