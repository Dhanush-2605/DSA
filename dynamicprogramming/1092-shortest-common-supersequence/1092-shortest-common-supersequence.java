class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int n1=str1.length();
        int n2=str2.length();
        int[][] dp=new int[n1+1][n2+1];
        for (int i=0;i<=n1;i++) dp[i][0]=0;
        for (int i=0;i<=n2;i++) dp[0][i]=0;
        for (int ind1=1;ind1<=n1;ind1++){
            for (int ind2=1;ind2<=n2;ind2++){
                int take=0;
                int unTake=0;
                if (str1.charAt(ind1-1)==str2.charAt(ind2-1)) take=1+dp[ind1-1][ind2-1];
           else unTake=Math.max(dp[ind1-1][ind2],dp[ind1][ind2-1]);
                dp[ind1][ind2]=Math.max(take,unTake);

            }
            
        }
        System.out.println(Arrays.deepToString(dp));
        int i=n1;
        int j=n2;
        String res="";
        while (i>0 && j>0){
      
             if (str1.charAt(i-1)==str2.charAt(j-1)){
                res+=str1.charAt(i-1);
                i-=1;
                j-=1;
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                      res+=str1.charAt(i-1);
                    i-=1;
            }               
            else{
                res+=str2.charAt(j-1);
                j-=1;   
             

                }
              
            
        }
        while (i>0){
            res+=str1.charAt(i-1);
            i-=1;
        }
         while (j>0){
            res+=str2.charAt(j-1);
             j-=1;
        }
        System.out.println(n1+n2-dp[n1][n2]);
        StringBuilder str=new StringBuilder(res);
        str.reverse();
        
        return str.toString();
        
        
    }
}