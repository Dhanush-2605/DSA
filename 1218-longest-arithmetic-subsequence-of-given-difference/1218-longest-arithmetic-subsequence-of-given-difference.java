class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        // Arrays.sort(arr);
        // int differenc=Math.abs(difference);
        int res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int val:arr){
            int diff=val-difference;
            map.put(val,map.getOrDefault(diff,0)+1);
            res=Math.max(res,map.get(val));
            // else map.put(val,1);
        }
    
        return res;
        
        
    }
}