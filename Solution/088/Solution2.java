public class Solution2{

    /**
     * 双指针从后往前
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m - 1;
        int q = n - 1;
        int len = m + n - 1;
        while ((p >= 0) && (q >= 0)) {
            nums1[len--] = (nums1[p] > nums2[q]) ? nums1[p--] : nums2[q--];
        }
        System.arraycopy(nums2, 0, nums1, 0, q + 1);
    }
}