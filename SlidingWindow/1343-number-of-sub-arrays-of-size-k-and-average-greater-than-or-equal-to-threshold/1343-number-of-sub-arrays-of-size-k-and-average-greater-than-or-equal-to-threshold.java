class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int s=0;       
        int e=k-1;
        int res=0; 
    
      
        while (e<arr.length){
            int tot=sum(arr,s,e);
            if (tot/k>=threshold) res++;
            s++;
            e++;
        }
        return res;
        
    }
    int sum(int[] arr,int s,int e){
        int su=0;
        for (int i=s;i<=e;i++) su+=arr[i];
        
        return su;
    }
}