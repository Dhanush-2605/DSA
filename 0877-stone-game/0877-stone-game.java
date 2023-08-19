class Solution {
    public boolean stoneGame(int[] piles) {
     boolean alice=true;
     int n=piles.length;

     int s=0;
     int e=n-1;
        int a=0;
        int b=0;
     while (e>=s){
        if (alice){
            if (piles[s]>=piles[e]){
                a+=piles[s];
                s++;
            }
            else{
                a+=piles[e];
                e--;
            }
            alice=false;
        }
         else{
            if (piles[s]>=piles[e]){
                b+=piles[e];
                e--;
            }
            else{
                b+=piles[s];
                s++;
            }
             alice=true;
         }
    }
        return (a>b);
    }
}