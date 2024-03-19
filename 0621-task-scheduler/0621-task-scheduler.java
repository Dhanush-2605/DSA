class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] ch=new int[26];
        for (char chr:tasks){
            ch[chr-'A']+=1;
        }
        Arrays.sort(ch);
        int max=ch[25]-1;
        int idl_slot=max*n;
        for (int i=24;i>=0;i--){
            idl_slot-=Math.min(ch[i],max);
        }
        
        return idl_slot>0?idl_slot+tasks.length:tasks.length;
        // for 
        
        
        
    }
}