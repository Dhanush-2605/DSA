class Solution {
    public int[] shuffle(int[] arr, int n) {
        int len=n/2;
        for (int i=0;i<n;++i){
         int curPos=i;
        int curElem=arr[curPos];
        while (curElem>0){
            int newPos=-1;
            if (curPos<n){
             newPos=2*curPos;
       
            }
            else{
                 newPos=2*(curPos-n)+1;
            
            }
            int temp=arr[newPos];
             arr[newPos]=-curElem;
            curElem=temp;
            curPos=newPos;
            
        }
        }
        for (int i=0;i<arr.length;i++){
             if (arr[i]<0) arr[i]=-arr[i];
        }
        return arr;
}
}