class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int l=0;
        int res=0;
        int r=piles.length-2;
        while (r>l){
            res+=piles[r];
            r=r-2;
            l++;
        }
        return res;
        
    }
}