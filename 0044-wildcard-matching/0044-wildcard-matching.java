class Solution {
    public boolean isMatch(String s, String p) {
        int n1=s.length();
        int n2=p.length();
        int[][] dp=new int[n1][n2];
        for (int[] row:dp) Arrays.fill(row,-1);
        if (recurse(n1-1,n2-1,s,p,dp)==1)return true; 
        return false;    
    }
    int recurse(int n1,int n2,String s,String p,int[][] dp){
        if (n1<0 && n2<0) return 1;
        if (n2<0 && n1>=0) return 0;
        if (n1<0 && n2>=0){
            for (int i=0;i<=n2;i++){
                if (p.charAt(i)!='*') return 0;
            }
         return 1;
         }
         if (dp[n1][n2]!=-1) return dp[n1][n2];



        if  (s.charAt(n1)==p.charAt(n2) || p.charAt(n2)=='?') return recurse(n1-1,n2-1,s,p,dp);
          if (p.charAt(n2)=='*'){
              int r1=recurse(n1-1,n2,s,p,dp);
              int r2=recurse(n1,n2-1,s,p,dp);
              if (r1==0 && r2==0) return dp[n1][n2]=0;
              else return dp[n1][n2]=1;
            
            
        }
        return dp[n1][n2]=0;
        
        

    }
}