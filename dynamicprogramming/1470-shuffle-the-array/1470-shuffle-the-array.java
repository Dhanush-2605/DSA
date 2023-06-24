class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[2*n];
        int ind1=0;
        for (int i=0;i<n;i++){
            res[ind1]=nums[i];
            ind1+=2;
        }
        int ind2=1;
        for (int i=n;i<2*n;i++){
            res[ind2]=nums[i];
            ind2+=2;
        }
        return res;
        
    }
}