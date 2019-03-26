package leecode;
//最长子序列之和最大
public class MaximumSubarray {
//    public static int maxSubArray(int[] nums) {
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            int tmp = sum(nums,i);
//            max = max<tmp?tmp:max;
//        }
//        return max;
//    }
//    public static int sum(int[] nums,int i){
//        if(i<0){
//            return 0;
//        } else {
//            return Math.max(sum(nums,i-1)+nums[i],nums[i]);
//        }
//    }
    public static int maxSubArray(int[] nums) {
        // 最大子序和
        int maxsofar = nums[0];

        // 包含最后一个节点的最大子序和
        int maxending = nums[0];

        for(int i=1;i<nums.length;i++) {
            maxending = Math.max(nums[i], maxending + nums[i]);
            maxsofar = Math.max(maxsofar,maxending);
        }
        return maxsofar;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
