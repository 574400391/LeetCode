class Solution {
    public int mySqrt(int x) {
        int low = 1;
        int high = x;

        while(low <= high){
            int mid = (high + low) / 2;
            if(x / mid < mid){
                high = mid - 1;
            }else if(x / mid > mid){
                low = mid + 1;
            }else
                return mid;

        }
        return low-1;
    }
}