class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
       HashMap<List<Integer>,Integer> map=new HashMap<>();
        for (int i=0;i<n;i++){
            List<Integer> arr=new ArrayList<>();
            for (int j=0;j<n;j++){
                arr.add(grid[j][i]);                
            }
            if (map.containsKey(arr)){
                map.put(arr,map.get(arr)+1);
            }
            else{
                map.put(arr,1);
            }
        }
        int ctn=0;
        for (int[] row:grid){
            List<Integer> al = new ArrayList<Integer>();
            for (int val:row) al.add(val); 
             if (map.containsKey(al)){
                 ctn+=map.get(al);
             };
        }
        return ctn;
        
        
    }
}