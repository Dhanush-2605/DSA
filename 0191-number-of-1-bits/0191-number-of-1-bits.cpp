class Solution {
public:
    int hammingWeight(uint32_t n) {
        int ctn=0;
        while(n!=0){
            ctn+=(n&1);
            n=n>>1;
            
        }
        return ctn;
        
    }
};