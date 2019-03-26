package leecode;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m+n];
        int j=0,k=0;
        for(int i=0;i<nums3.length;i++){
            if(j==m&&k==n)break;
            if(j==m){
                nums3[i]=nums2[k++];
            }else if(k==n){
                nums3[i]=nums1[j++];
            }else{
                if(nums1[j]>nums2[k])nums3[i]=nums2[k++];
                else nums3[i]=nums1[j++];
            }
        }
        for (int i = 0; i < nums3.length; i++) {
            nums1[i]=nums3[i];
        }
//        nums1=nums3;
        System.out.println(nums1);
    }

    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        merge(nums1,3,nums2,3);
    }
}
