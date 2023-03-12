class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;

    int len = (int)(Math.log10(x) + 1);  
    if (len<0) return true;


    int[] arr=new int[len];
        int ind=0;
    for (int i=0;i<len;i++){
            int num=x%10;
            x=x/10;
            arr[ind]=num;
            ind++;
        }
        int s=0;
        int e=len-1;
        while (e>=s){
            if (arr[e]!=arr[s]) return false;
            e--;
            s++;
        }
        
        return true;
    
       
 
    }
}