class Solution {

    public boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;

        while (low <= high) {
            int mid = (low + high)/2;
            if (num/mid < mid) {
                high = mid - 1;
            } else if (num/mid > mid) {
                low = mid + 1;
            } else {
                return mid * mid == num;
            }
        }
        return (low * low) == num;
    }
}