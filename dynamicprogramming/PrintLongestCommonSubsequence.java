import java.util.*;
public class PrintLongestCommonSubsequence {
    public static void main(String[] args) {
        String s1="abcde";
        String s2="bdgek";
        int n1=s1.length();
        int n2=s2.length();
        String res="";
        int[][] dp= new int[n1+1][n2+1];
        for (int i=0;i<=n1;i++) dp[i][0]=0;
        for (int j=0;j<=n2;j++) dp[0][j]=0;

        for (int ind1=1;ind1<=n1;ind1++){
            for (int ind2=1;ind2<=n2;ind2++){
               if (s1.charAt(ind1-1)==s2.charAt(ind2-1)) dp[ind1][ind2]=1+dp[ind1-1][ind2-1];
                
               else dp[ind1][ind2]=Math.max(dp[ind1-1][ind2],dp[ind1][ind2-1]);
              
            }
        }
        System.out.println(Arrays.deepToString(dp));
        int i1=n1;
        int i2=n2;
        while (i1>0 && i2>0){
            if (s1.charAt(i1-1)==s2.charAt(i2-1)){
                res+=s1.charAt(i1-1);
                i1-=1;
                i2-=1;
            }
            else{
                if (dp[i1][i2]==dp[i1-1][i2]){
                    i1-=1;
                }
                else{
                    i2-=1;
                }

            }
        }
        // return recurse(text1.length()-1,text2.length()-1,text1,text2,dp);
        
        System.out.println(res);
    }
  
    
}
  