package leecode;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4,0};
        System.out.println(threeSumClosest(nums,1));
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int result = 0;
        for(int i=0;i<nums.length;i++){
            int l = i+1;
            int k = nums.length-1;
            while (l<k){
                int sum = nums[i]+nums[l]+nums[k];
                int abs = Math.abs(sum-target);
                if(abs==0)return sum;
                if(sum-target>0){
                    if(abs<min){
                        min = abs;
                        result = sum;
                    }
                    k--;
                }else if(sum-target<0){
                    if(abs<min){
                        min = abs;
                        result = sum;
                    }
                    l++;
                }else {
                    while (l<k&&nums[l+1]==nums[l])l++;
                    while (l<k&&nums[k]==nums[k-1])k--;
                }
            }
        }
        return result;
    }
}
