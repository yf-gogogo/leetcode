package leecode;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        List<List<Integer>> ll = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(map.containsKey(-(nums[i]+nums[j]))&&map.get(-(nums[i]+nums[j]))>j){
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[map.get(-(nums[i]+nums[j]))]);
                    boolean skip = false;
                    for(List ol :ll){
                        if(ol.equals(l))skip = true;
                    }
                    if(skip)continue;
                    ll.add(l);
                }
            }
        }
        return ll;
    }
}
