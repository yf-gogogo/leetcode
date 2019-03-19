package leecode;

import java.util.ArrayList;
import java.util.Collections;

public class MultiplyStrings {
    public static void main(String[] args) {
        multiply("99","3");
    }
    public static String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0"))return "0";
        if(num1.equals("1"))return num2;
        if(num2.equals("1"))return num1;
        int l1 = num1.length();
        int l2 = num2.length();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < l1; i++) {
            list1.add(num1.charAt(i)-'0');
        }
        for (int i = 0; i < l2; i++) {
            list2.add(num2.charAt(i)-'0');
        }

        Collections.reverse(list1);
        Collections.reverse(list2);

        System.out.println(list1);
        System.out.println(list2);
        ArrayList<Integer> mul = new ArrayList<>();
        for (int i = 0; i < l1+l2; i++) {
            mul.add(0);
        }
        int yvshu;
        int jinwei = 0;
        for (int i = 0; i < list1.size(); i++) {
            yvshu = 0;
            jinwei = 0;
            for (int j = 0; j < list2.size(); j++) {
                //相乘➕进位
                int tmp = list1.get(i)*list2.get(j)+jinwei;
                //余数
                yvshu = (tmp+mul.get(i+j))%10;
                //进位
                jinwei = (tmp+mul.get(i+j))/10;
                //赋值
                mul.set(i+j,yvshu);
            }
            mul.set(i+list2.size(),jinwei);
        }
        System.out.println(mul);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mul.size()-1 ; i++) {
            sb.append(mul.get(i));
        }
        if(mul.get(mul.size()-1)!=0)sb.append(mul.get(mul.size()-1));
        System.out.println(sb.reverse());
        return sb.toString();
    }
}
