class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int res=0;
        int[] sum=new int[n];
        for(int i=0;i<m;i++){
            Arrays.fill(sum,0);
            for (int j=i;j<m;j++){
                for (int k=0;k<n;k++){
                    sum[k]+=matrix[j][k];
                }
                res+=getSum(sum,target);
            }
        }
        return res;
        
    }
    
    int getSum(int[] nums,int k){
        
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int pSum=0;
        int ctn=0;
        for (int num:nums){
            pSum+=num;
            if (map.containsKey(pSum-k)){
                ctn+=map.get(pSum-k);
            }
            map.put(pSum,map.getOrDefault(pSum,0)+1);
            
        }
        return ctn;
    }
}