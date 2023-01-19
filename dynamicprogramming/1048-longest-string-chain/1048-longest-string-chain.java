class Solution {
    public int longestStrChain(String[] words) {
        int n=words.length;
        int[] dp=new int[n];
        Arrays.sort(words,(a, b) -> a.length() - b.length());
        Arrays.fill(dp,1);
        for (int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                if (compare(words[j],words[i]) && 1+dp[j]>dp[i]){
                    dp[i]=1+dp[j];
                    
                }
            }
        }
        int max=0;
        for (int j=0;j<dp.length;j++){
            if (dp[j]>max) max=dp[j];
        }
        return max;
        
    }
    boolean compare(String s1,String s2){
        
        int n1=s1.length();
        int n2=s2.length();
        if (n1!=n2-1) return false;
        int i=0;
        int j=0;
        while (j<n2){
            if (i<n1 && s1.charAt(i)==s2.charAt(j)){
               
                i++;
                j++;
            }
            else{
                j++;
               
            }
        }
     
      if (i==n1 && j==n2) return true;
        return false;
        
    }
}