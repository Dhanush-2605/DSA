class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=new ArrayList<>();
        cyclicSort(nums);
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=i+1) res.add(nums[i]);
        }
        // System.out.println(Arrays.toString(nums));
        return res;
        
        
    }
    void cyclicSort(int[] nums){
        int i=0;
        while (i<nums.length){
            int cI=nums[i]-1;
            if (nums[i]==nums[cI]) i++;
            else{
                int temp=nums[i];
                nums[i]=nums[cI];
                nums[cI]=temp;
            }
        }
}
}