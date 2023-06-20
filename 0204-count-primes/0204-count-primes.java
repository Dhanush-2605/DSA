class Solution {
    public int countPrimes(int n) {
        
        boolean[] prime=new boolean[n];
        for (int i=0;i<n;i++){
            prime[i]=true;
        }
        int ctn=0;
        for (int i=2;i*i<n;i++){
            
            if (prime[i]==true){
                for (int j=i*i;j<n;j+=i){
                    prime[j]=false;
                }
            }
        }
       
        for (int i=2;i<n;i++){
            if (prime[i]) ctn++;
        }
        return ctn;
        
        
    }
}