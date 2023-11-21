class Solution {
    int mod=1000000007;
    public int countNicePairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int res=0;
        for (int val:nums){
            int rev=revNum(val);
            int diff=val-rev;

         
            int ctn=map.getOrDefault(diff,0);
            res=(res+ctn)%mod;
            map.put(diff,ctn+1);                


        }
   

        return res%mod;
    }
    int revNum(int num){
        int res=0;
        int len=String.valueOf(num).length();
        while (num!=0){
            int temp=num%10;
            res+=(int)Math.pow(10,len-1)*temp;
            num=num/10;
            len--;
        }

return res;

    }

}