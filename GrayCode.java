package leecode;

import java.util.ArrayList;
import java.util.List;
//格雷编码
// 搞清楚格雷编码的生成过程, G(i) = i ^ (i/2);
public class GrayCode {
    public static List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        int l = 1<<n;
        for(int i=0;i<l;i++){
            list.add(i^(i/2));
        }
        return list;
    }

    public static void main(String[] args) {
        grayCode(2);
    }
}
