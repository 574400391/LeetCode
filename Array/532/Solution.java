import java.util.HashSet;
import java.util.Map;

class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k < 0) return 0;
        Arrays.sort(nums);
        HashSet s=new HashSet<>();
        HashSet res=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(s.contains(nums[i])) res.add(nums[i]);
            s.add(nums[i]+k);
        }
        return res.size();
    }
}