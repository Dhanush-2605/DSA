class Solution {
    public int findKthPositive(int[] arr, int k) {
        int len=arr[arr.length-1];
        int ind=0;
        int ans=0;
        for (int i=1;i<=len;i++){
            if (arr[ind]!=i){
                if (k==0) return ans;
                ans=i;
                k--;

            }else{
                ind++;
            }
        }
        if (ans!=0 && k==0) return ans;
        return len+k;
        
    }
}