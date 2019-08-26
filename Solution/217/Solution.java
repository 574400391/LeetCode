class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums == null) return false;
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums){
            if(!set.add(i)) return true;
        }
        return false;
    }
}
import java.util.HashSet;