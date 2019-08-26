

public class Solution {

    public int searchInsert(int[] nums, int target) {
        if(nums == null) return 0;
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(target == nums[mid]){
                return mid;
            } else if(target > nums[mid]){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}