class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || nums.length < 2 || k < 0) return false;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= k){
                return true;
            } else {
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
import java.util.HashMap;
import java.util.Map;