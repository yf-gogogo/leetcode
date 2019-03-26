package leecode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//螺旋矩阵
public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        if(m==0)return list;
        int n = matrix[0].length;
        if(n==0)return list;
        boolean[][] marked = new boolean[m][n];

        int i=0,j=0;
        while (list.size()<m*n){
            while (j<n&&marked[i][j]!=true){
                list.add(matrix[i][j]);
                marked[i][j] = true;
                j++;
            }
            j--;
            i++;
            while (i<m&&marked[i][j]!=true){
                list.add(matrix[i][j]);
                marked[i][j] = true;
                i++;
            }
            i--;
            j--;
            while (j>=0&&marked[i][j]!=true){
                list.add(matrix[i][j]);
                marked[i][j] = true;
                j--;
            }
            j++;
            i--;
            while (i>=0&&marked[i][j]!=true){
                list.add(matrix[i][j]);
                marked[i][j] = true;
                i--;
            }
            i++;
            j++;
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
}
