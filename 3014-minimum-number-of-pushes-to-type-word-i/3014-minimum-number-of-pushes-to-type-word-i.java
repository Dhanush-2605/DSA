class Solution {
    public int minimumPushes(String word) {
        int ind=1;
        int sum=0;
        int ctn=1;
        for (int i=0;i<word.length();i++){
            
            if (ind>8){
                ind=2;
                ctn++;
            }
            else ind++;
            sum=sum+ctn;
        }
        return sum;
    }
}