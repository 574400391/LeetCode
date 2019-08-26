class Solution {
    public int findMaxConsecutiveOnes1(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        StringBuilder sBuidler = new StringBuilder();
        for(int i: nums){
            sBuidler.append(i);
        }
        String result = sBuidler.toString();
        String[] resArr = result.split("0");
        int count = 0;
        for(String s: resArr){
            if(s.length() > count){
                count = s.length();
            }
        }
        return count;
    }

    public int findMaxConsecutiveOnes2(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int count = 0;
        int len = nums.length;
        int tmp = 0;
        for(int i = 0; i< len; i++){
            tmp = (tmp + 1) * nums[i];
            if(count < tmp){
                count = tmp;
            }
        }
        return count;
    }
}