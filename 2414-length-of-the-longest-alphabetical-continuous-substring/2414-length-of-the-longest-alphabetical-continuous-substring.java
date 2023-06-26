class Solution {
    public int longestContinuousSubstring(String s) {
     	char str=s.charAt(0);
		int prev=str;
		int cSum=1;
        int res=1;
		for (int i=1;i<s.length();i++){
		    char cur=s.charAt(i);
		    int temp=cur;
				int diff=temp-prev;
		    if (diff==1){
		        cSum++;
                											                              res=Math.max(res,cSum);

		    }
			else{
		        cSum=1;
		    }

		    prev=temp;
		    
		}
        
        return res;
    }
}