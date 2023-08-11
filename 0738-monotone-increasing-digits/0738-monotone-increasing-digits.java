class Solution {
    public int monotoneIncreasingDigits(int n) {
        char[] arr=String.valueOf(n).toCharArray();
      

        int i=1;
        while (i<arr.length && arr[i]>=arr[i-1]){
            i++;            
        }
        while (i>0 && i<arr.length && arr[i-1]>arr[i]){
            arr[i-1]--;
            i--;
        }
        for (int j=i+1;j<arr.length;j++){
            arr[j]='9';
        }

        String res="";
        for (char ch:arr){
            res+=ch;
            
        }
     
        
     
        

        return Integer.valueOf(res);
        
    }
}