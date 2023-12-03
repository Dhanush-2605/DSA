class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gSum=0;
        int cSum=0;
        int total=0;
        int res=0;
        for (int val:gas) gSum+=val;
        for (int val:cost) cSum+=val;
        if (cSum>gSum) return -1;
        for (int i=0;i<gas.length;i++){
            total+=gas[i]-cost[i];
            if (total<0){
                total=0;
                res=i+1;
                
            }
        }
        return res;
    }
    
}