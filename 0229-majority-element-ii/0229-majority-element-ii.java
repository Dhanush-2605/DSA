class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int n=nums.length;
        int e1=Integer.MIN_VALUE;
        int e2=Integer.MIN_VALUE;
        int c1=0;
        int c2=0;
        for (int num:nums){
            if (num==e1){
                c1++;              
            }
            else if (num==e2) c2++;
            else if (c1==0){
                e1=num;
                c1=1;
            }
            else if (c2==0){
                e2=num;
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
            
            
        }
		c1=0;
		c2=0;
		for (int num:nums){
		    if (e1==num) c1++;
		    if (e2==num) c2++;
		}
		if (c1>n/3) res.add(e1);
		if (c2>n/3 && (e1!=e2)) res.add(e2);        		
        return res;
        
    }
}