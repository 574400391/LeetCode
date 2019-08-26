class Solution {
    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        for(int n:nums){
            if(n>max3){  
                max1 = max2;
                max2 = max3; 
                max3 = n;
            }else if(n>max2 && n<max3){
                max1 = max2;
                max2 = n;
            }else if(n>max1 && n<max2){
                max1 = n;
            }
        }
        return max1==Long.MIN_VALUE?(int)max3:(int)max1;
    }
}