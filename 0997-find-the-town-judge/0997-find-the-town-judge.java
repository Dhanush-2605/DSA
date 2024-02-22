class Solution {
    public int findJudge(int n, int[][] trust){
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();    
        if (trust.length==0 && n==1) return 1;
        for (int[] arr:trust){
            if (map.containsKey(arr[1])) map.get(arr[1]).add(arr[0]);
            else{
              ArrayList<Integer> temp=new ArrayList<>();
              temp.add(arr[0]);
            map.put(arr[1],temp);
            }
           
        }
        int ans=-1;
        for (Map.Entry<Integer,ArrayList<Integer>> entry:map.entrySet()){
            if (entry.getValue().size()==n-1) ans=entry.getKey();
        }
        boolean vis=false;
        for (Map.Entry<Integer,ArrayList<Integer>> entry:map.entrySet()){
            if (entry.getValue().contains(ans)) vis=true;
        }
  
        if (vis==false) return ans;
        return -1;
    }
}