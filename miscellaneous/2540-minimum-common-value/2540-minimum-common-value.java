class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int l=0;
        int r=0;
        int n1=nums1.length;
        int n2=nums2.length;
        while (l<n1 && r<n2){
            if (nums1[l]==nums2[r]) return nums1[l];
            else{
                if (nums2[r]>nums1[l]) l++;
                else r++;
            }
        }
        return -1;
    }
}