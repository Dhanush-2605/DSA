class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->a[1]-b[1]);    
        int len=pairs.length;
        int c=1;
        int prevMax=pairs[0][1];
        for (int i=1;i<len;i++){
            if (pairs[i][0]>prevMax){
                prevMax=pairs[i][1];
                c++;
            }
            
        }
        return c;
        
    }
}