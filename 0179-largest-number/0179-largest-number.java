class Solution {
    public String largestNumber(int[] nums) {
        ArrayList<Integer> l=new ArrayList<>();
        int n=nums.length;
        String[] res=new String[n];
        int i=0;
        for (int val:nums){
            res[i]=String.valueOf(val);
            i++;
        }
        String ans="";
            Arrays.sort(res,(a,b)->(b+a).compareTo(a+b));
        for (String val:res) ans+=val;
       char ch=ans.charAt(0);
        for (int j=1;j<ans.length();j++){
           char cur=ans.charAt(j);
            if (cur=='0' && ch==cur) return "0";
        }
        return ans;

        
    }
}