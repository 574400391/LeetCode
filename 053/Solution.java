class Solution{

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int sum = nums[0];
        for (int i = 1; i < n; i++){
            if (sum <0){
                sum = nums[i];
            }else{
                sum += nums[i];
            }
            max = Math.max(max,sum);
        }
        return max;
    }

    public int maxSubArray1(int[] nums) {
        
    }
}