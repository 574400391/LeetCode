class Solution{

    public int maxSubArray(int[] nums) {
        int sum = 0;
        int count = nums[0];
        for (int num: nums) {
            if (sum < 0) {
                sum = num;
            } else {
                sum += num;
            }
            count = Math.max(count, sum);
        }
        return count;
    }
}