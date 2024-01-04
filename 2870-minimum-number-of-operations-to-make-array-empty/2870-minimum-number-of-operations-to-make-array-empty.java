class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int val:nums){
            if (map.containsKey(val)) map.put(val,map.get(val)+1);
            else map.put(val,1);
        }
        int res=0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            int cur=entry.getValue();
            if (cur==1) return -1;
             int rem=cur%3;
             int ctn=cur/3;
             
              if (rem%2!=0){
                     res+=(ctn-1);                                      

                     cur=(rem+3);                                       

                     res+=cur/2;
                 }
                 else{
                     res+=ctn;
                     res+=rem/2;

                 }


        }
        return res;
    }
}