class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        ArrayList<Integer> temp=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int val:banned) map.put(val,1);
        int tot=0;
        int ctn=0;
        for (int i=1;i<=n;i++){
            if (!map.containsKey(i)){              
                tot+=i;
                if (tot<=maxSum) ctn++;

            }
        }
        return ctn;
   
        
    }
}