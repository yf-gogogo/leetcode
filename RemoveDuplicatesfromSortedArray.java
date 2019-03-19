package leecode;

public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int len = 1;
        int i = 0;
        while (i<nums.length){
           if(i+1<nums.length&&nums[i]!=nums[i+1]){
               nums[len++]=nums[i+1];
           }
           i++;
        }
        return len-1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int len = removeDuplicates(nums);
        for (int i = 0; i <= len; i++) {
            System.out.print(String.valueOf(nums[i])+',');
        }
    }
}
