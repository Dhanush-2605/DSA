class Solution {
    public int minEatingSpeed(int[] arr, int h) {
 		int len=arr.length;   
        int r=-1;
      for(int i=0;i<arr.length;i++){
            r=Math.max(r,arr[i]);
        }
		int l=1;
		int ans=r;
		while (r>l){
		    int mid=l+(r-l)/2;
		    int c=0;
		    for (int i=0;i<len;i++){
		        int q=arr[i]/mid;
		        int rem=arr[i]%mid;
		        c+=q;		       
		       if (rem!=0){
		            c++;
		        }		        
		        
		    }		    
		    if (c<=h){		        
		      ans=Math.min(ans,mid);
		      r=mid;  
		    } 
		    else l=mid+1;
		}
        return ans;
        
    }
}