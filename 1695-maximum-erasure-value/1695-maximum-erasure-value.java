class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l=0;
        int r=0;
        int gMax=nums[0];
        int cMax=0;
        Set<Integer> set=new HashSet<>();
        while (r>=l && r<nums.length){
            if (set.contains(nums[r])){
                set.remove(nums[l]);  
                cMax=cMax-nums[l];
                      
                l++;
            }
            else{
            set.add(nums[r]);
            cMax+=nums[r];
            r++;
        }
        gMax=Math.max(gMax,cMax);

            
        }

        return gMax;
    }
}