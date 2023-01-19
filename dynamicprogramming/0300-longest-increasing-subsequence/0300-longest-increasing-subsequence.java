class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> res=new ArrayList<>();
        res.add(nums[0]);
        for (int i=1;i<nums.length;i++){
            if (nums[i]>res.get(res.size()-1)) res.add(nums[i]);
            else{
                int target=nums[i];
                int ind=0;
                int s=0;
                int e=res.size()-1;
                while (e>=s){
                    int mid=s+(e-s)/2;
                    if (res.get(mid)==target) {
                        ind=mid;
                        break;
                    }
                    if (res.get(mid)<target) s=mid+1;
                    else{
                        e=mid-1;
                        ind=mid;
                    }
                    
                }
                res.set(ind,target);
            }
        }
        return res.size();
    }
}