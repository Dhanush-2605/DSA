class Solution {
    public List<Integer> majorityElement(int[] nums) {
		int n=nums.length;
		List<Integer> res=new ArrayList<>();
		int can1=-1;
		int can2=-1;
		int count2=0;
		int count=0;
		for (int num:nums){
		  
		    if (num==can1) count++;
            else if (num==can2) count2++;
		    else if (count==0){
		            can1=num;
		            count=1;
		}
		    else if (count2==0){
                    can2=num;
                    count2=1;
                }
		    else{
                count--;
                count2--;
	
		    }
		    
		}
	
		count=0;
		count2=0;
		for (int num:nums){
		    if (can1==num) count++;
		    if (can2==num) count2++;
		}
		if (count>n/3) res.add(can1);
		if (count2>n/3 && (can1!=can2)) res.add(can2);        		
	 
        return res;
		
		

    }
}
