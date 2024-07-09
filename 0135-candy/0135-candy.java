class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int[] ctn=new int[n];
        Arrays.fill(ctn,1);
        //left
        for (int i=1;i<n;i++){
            int prev=ratings[i-1];
            int cur=ratings[i];
            if (cur>prev){
                int curCandy=ctn[i-1];
                ctn[i]=ctn[i-1]+1;                
            }
        
        }
        //right
        for (int i=n-2;i>=0;i--){
            int prev=ratings[i+1];
            int cur=ratings[i];
            if (cur>prev){
                int curCandy=ctn[i+1];
                // while (curCandy<=ctn[i]) curCandy++;
                ctn[i]=Math.max(ctn[i],curCandy+1);                
            }     
        }
        int sum=0;
        // System.out.println(Arrays.toString(ctn));
        for (int val:ctn) sum+=val;
        return sum;
    }
}