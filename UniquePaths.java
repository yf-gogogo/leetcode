package leecode;

import java.math.BigInteger;

public class UniquePaths {
    public static int uniquePaths(int m, int n) {
//        dfs(0,0,m,n);
//        return pathNum;
//        return dp(m,n);
//        return (m-1)*(n-1)+(m-1)+(n-1)-1;
        int[][] path = new int[m][n];
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0||j==0){
                    path[i][j]=1;
                }else {
                    path[i][j]=path[i-1][j]+path[i][j-1];
                }
            }
        }
        return path[m-1][n-1];
    }
//    static int pathNum = 0;
//    public static void dfs(int i,int j,int m,int n){
//        if(i+1==m&&j+1==n){
//            pathNum++;
//            return;
//        }
//        if (i<m&&j<n){
//            dfs(i+1,j,m,n);
//            dfs(i,j+1,m,n);
//        }
//    }

//    public static int dp(int m,int n){
//        if(m==1&&n>1){
//            return dp(m,n-1);
//        }
//        if(n==1&&m>1){
//            return dp(m-1,n);
//        }
//        if(m>1&&n>1){
//            return dp(m-1,n)+dp(m,n-1);
//        }
//        return 1;
//    }
    public static void main(String[] args) {

//        System.out.println(uniquePaths(30,7));
        String s = "你好啊a";
        char c = '你';
        System.out.println(s.getBytes());
    }
}
