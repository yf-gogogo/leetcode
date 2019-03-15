package leecode;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("([)]"));
    }
    public static boolean isValid(String s) {
        Map<Character ,Character> map = new HashMap<>();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');
        ArrayDeque<Character> ad = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                ad.offerFirst(s.charAt(i));
                continue;
            }
            if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']'){
                if(ad.isEmpty())return false;
                if(s.charAt(i)==map.get(ad.peekFirst())){
                    ad.pollFirst();
                    continue;
                }else {
                    return false;
                }
            }
        }
        if(ad.isEmpty())return true;
        return false;
    }
}
