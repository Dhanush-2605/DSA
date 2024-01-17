class Solution {
       Set<List<Integer>> set=new HashSet<>();

    public List<List<Integer>> permuteUnique(int[] arr) {
           List<Integer> cur=new ArrayList<>();

           for (int val:arr) cur.add(val);
        
    	    recurse(cur,0);
            List<List<Integer>> ans=new ArrayList<>();


    	   for (List<Integer> temp:set) ans.add(temp);

    	    return ans;     
    }
  void swap(List<Integer> temp,int s,int e){
        int cur=temp.get(s);
        temp.set(s,temp.get(e));
        temp.set(e,cur);
    }
    void recurse(List<Integer> arr,int ind){
	    if (ind==arr.size()-1){
	        List<Integer> temp=new ArrayList<>(arr);
	        set.add(temp);
	        return;
	    }
	    for (int i=ind;i<arr.size();i++){
	        swap(arr,ind,i);
	        recurse(arr,ind+1);
            swap(arr,ind,i);
	    }
	    return;
	}
}

