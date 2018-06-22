class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int high = nums.length;
        int low = 0;
        while (low < high){
            int mid = (low + high) / 2;
            if(nums[mid] <= mid){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low + 1;
    }
}
import java.util.Arrays;