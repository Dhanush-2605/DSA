class Solution {
    public int[] twoSum(int[] numbers, int target) {
  		int s=0;
		int e=numbers.length-1;
		int[] res=new int[2];
		Arrays.fill(res,-1);
		while (e>s){
		    int sum=numbers[s]+numbers[e];
		    if (sum==target){
		        res[0]=s+1;
		        res[1]=e+1;
		    }
		    if (sum>target) e--;
		    else s++;
		}
        return res;
    }
}