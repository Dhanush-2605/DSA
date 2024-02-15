class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        ArrayList<Integer> temp=new ArrayList<>();
        
        temp.add(0);
        temp.add(1);
        temp.add(n-1);
        int ans=1;
        for (int i=0;i<3;i++){
            ans=ans*nums[temp.get(i)];
        }
        int res=nums[n-1]*nums[n-2]*nums[n-3];
        if (ans>res) return ans;
        return res;
        
    }
}