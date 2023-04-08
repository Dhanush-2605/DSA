class Solution {
    public int[] sumZero(int n) {
      int sign=n%2;
      int[] res=new int[n];
          int half=n/2;      
          int ind=0;
          for (int i=1;i<=half;i++){
            res[ind]=-(i);
            ind++;
          }
          for (int i=1;i<=half;i++){
            res[ind]=(i);
            ind++;
          }
      
    return res;

    }
}