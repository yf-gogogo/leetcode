package leecode;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> listList = new ArrayList<>();
        boolean[] b = new boolean[nums.length];
        dfs(nums,0,b,listList);
        return listList;
    }
    public static void dfs(int[] nums,int level,boolean[] b,List<List<Integer>> listList){

        if(level>=nums.length){
           List<Integer> list = new ArrayList<>();
            for (int i = 0; i < b.length; i++) {
                if(b[i])list.add(nums[i]);
            }
            listList.add(list);
            return;
        }else {
            b[level]=false;
            dfs(nums,level+1,b,listList);
            b[level]=true;
            dfs(nums,level+1,b,listList);
        }

    }

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(subsets(nums).size());

    }
}
