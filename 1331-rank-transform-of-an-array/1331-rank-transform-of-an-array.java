class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int len=arr.length;
        int[] arr1=new int[len];
        for (int i=0;i<len;i++){
            arr1[i]=arr[i];
        }
        int[] res=new int[len];
        
        HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(arr1);
        int r=1;
        for (int i=0;i<len;i++){
            
            if (!map.containsKey(arr1[i])){
                map.put(arr1[i],r);
                r++;
            }
            
        }
        for (int i=0;i<len;i++){
            res[i]=map.get(arr[i]);
        }
        // System.out.println(map);
        return res;
        
    }
}