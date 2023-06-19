class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int[] merge=new int[n1+n2];
        int ind=0;
        for (int i=0;i<n1;i++){
            merge[ind++]=nums1[i];
        }
        for (int i=0;i<n2;i++){
            merge[ind++]=nums2[i];
        }
        Arrays.sort(merge);
        int n=merge.length;
        double med=0;
        if (n%2==0){
            int f=n/2;
            int e=f;
            f=f-1;
            med=((double)(merge[f]+merge[e]))/2;
            
        }
        else{
            med=merge[n/2];
        }
        return med;
        
    }
}