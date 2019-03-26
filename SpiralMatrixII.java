package leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrixII {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        if(n<1)return matrix;
        boolean[][] marked = new boolean[n][n];

        int i=0,j=0,k=1;
        while ( k <= n*n) {
            while (j<n&&marked[i][j]!=true){
                matrix[i][j]=k;
                marked[i][j] = true;
                j++;
                k++;
            }
            j--;
            i++;
            while (i<n&&marked[i][j]!=true){
                matrix[i][j]=k;
                marked[i][j] = true;
                i++;
                k++;
            }
            i--;
            j--;
            while (j>=0&&marked[i][j]!=true){
                matrix[i][j]=k;
                marked[i][j] = true;
                j--;
                k++;
            }
            j++;
            i--;
            while (i>=0&&marked[i][j]!=true){
                matrix[i][j]=k;
                marked[i][j] = true;
                i--;
                k++;
            }
            i++;
            j++;
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[][] result = generateMatrix(3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(result[i][j]);
            }
        }
    }
}
