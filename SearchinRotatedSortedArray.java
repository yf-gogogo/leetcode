package leecode;

public class SearchinRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {7,8,1,2,3,4,5,6};
        System.out.println(search(nums,8));

    }

    /**
     * 先判断是否为有序的，有序直接进行二分查找；
     * 否则对中点进行分情况讨论：
     * 1.左侧有序
     * 2.右侧有序
     * 然后分情况讨论
     * @param nums
     * @param target
     * @return
     */
    public static int search(int[] nums, int target) {
        if(nums.length==0)return -1;
        int l = 0;
        int r = nums.length-1;
        int m;
        while (l<=r){
            m = (l+r)/2;
            if(target==nums[m])return m;
            if(target==nums[r])return r;
            if(target==nums[l])return l;
            //不旋转
            if(nums[l]<nums[r]){
                if(target<nums[m]){
                    r = m-1;
                }else {
                    l = m+1;
                }
            }else {
                if(nums[m]>nums[l]){
                    //[4,5,6,7,8,1,2,3]
                    if(target<nums[m]&&target>nums[r]){
                        r = m-1;
                    }else {
                        l = m+1;
                    }
                }else {
                    //[7,8,1,2,3,4,5,6]
                    if(target>nums[m]&&target<nums[l]){
                        l = m+1;
                    }else {
                        r = m-1;
                    }
                }
            }
        }
        return -1;
    }
}
