package leecode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    //参考：https://blog.csdn.net/qq_16403141/article/details/80548282
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        fullSort(result,nums,0,nums.length);
        return result;
    }
    public static void fullSort(List<List<Integer>> result,int[] nums,int start,int end){
        if(start==end){
            List<Integer> list = new ArrayList<>();
            for (int i:nums) {
                list.add(i);
            }
            result.add(list);
        }
        for (int i = start; i < end; i++) {
            swap(nums,i,start);
            fullSort(result,nums,start+1,end);
            swap(nums,i,start);
        }
    }
    public static void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(permute(nums));
    }
}
