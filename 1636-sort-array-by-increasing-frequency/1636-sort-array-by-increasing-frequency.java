class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        int[] res=new int[n];

        for (int val:nums){
            list.add(val);
            if (map.containsKey(val)) map.put(val,map.get(val)+1);
            else map.put(val,1);
        }
        
        Collections.sort(list,(a,b)->{
            int n1=map.get(a);
            int n2=map.get(b);
            if (n1!=n2) return n1-n2;
             return b-a;
            
        });
        for (int i=0;i<n;i++){
            res[i]=list.get(i);
            
        }
        
        
        return res;
    }
}