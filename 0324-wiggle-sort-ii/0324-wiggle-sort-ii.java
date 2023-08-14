class Solution {
    public void wiggleSort(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int val: nums) list.add(val);
        Collections.sort(list);
        int n=nums.length-1;
        int i=0;
        int j=1;
        while (j<nums.length){
            nums[j]=list.get(n);
            j+=2;
            n--;
        }
      while (i<nums.length){
            nums[i]=list.get(n);
            i+=2;
            n--;
        }        
        
    }

}