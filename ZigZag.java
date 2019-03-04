package leecode;

public class ZigZag {
    public static String convert(String s, int numRows) {
        int length = s.length();
        char[][] zig = new char[numRows][length];
        for(int i=0;i<numRows;i++) {
            for (int j = 0; j < length; j++) {
                zig[i][j]=' ';
            }
        }
        int m=0,n=0,l=0;
        while (l<length){
            if(m==0){
                for(int j=0;j<numRows;j++){
                    if (l>=length)break;
                    zig[m][n]=s.charAt(l);
                    m++;
                    l++;
                }
                n++;
            }else if(m--==numRows){
                for(int j=0;j<numRows-1;j++){

                    if (l>=length)break;
                    m--;
                    if (m==0)continue;
                    zig[m][n++]=s.charAt(l);
                    l++;
                }
            }
        }
        char[] result =new char[length];
        int k=0;
        for(int i=0;i<numRows;i++){
            for(int j=0;j<n;j++){
                if(zig[i][j]!=' ') result[k++]=zig[i][j];
            }
        }
        return new String(result);
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING",4));
    }
}
