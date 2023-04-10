class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len=flowerbed.length;
        int count=0;
        for (int i=0;i<len;i++){
            if (flowerbed[i]==0){
                int prev=(i==0 || flowerbed[i-1]==0?0:1);
                int next=(i==len-1 || flowerbed[i+1]==0?0:1);
                if (prev==0 && next==0){
                    flowerbed[i]=1;
                   count++;
                }
            }
        }
        if (count>=n){
              return true;
        }
        return false;
    }
}