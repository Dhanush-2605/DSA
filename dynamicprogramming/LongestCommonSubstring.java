import java.util.Arrays;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        String s1="abcjklp";
        String s2="acjkp";
        int n1=s1.length();
        int n2=s2.length(); 
        int res=0;
        int[][] dp= new int[n1+1][n2+1];
        for (int i=0;i<=n1;i++) dp[i][0]=0;
        for (int j=0;j<=n2;j++) dp[0][j]=0;

        for (int ind1=1;ind1<=n1;ind1++){
            for (int ind2=1;ind2<=n2;ind2++){
               if (s1.charAt(ind1-1)==s2.charAt(ind2-1)) dp[ind1][ind2]=1+dp[ind1-1][ind2-1];
                
               else dp[ind1][ind2]=0;
               res=Math.max(res,dp[ind1][ind2]);
              
            }
        }
        System.out.println(Arrays.deepToString(dp));
        System.out.println(res);
    }
    // static int recurse(int ind1,int ind2,String s1,String s2){
    //     if (ind1<0 || ind2 <0) return 0;
    //     if (s1.charAt(ind1)==s2.charAt(ind2)) return 1+ recurse(ind1-1, ind2-1, s1, s2);
    //     else return recurse(ind1-1, ind2-1, s1, s2)-1;
    // }
    
}
