class Solution {
    public int missingNumber(int[] arr) {
      cyclic(arr);
      // System.out.println(Arrays.toString(arr));
      for (int j=0;j<arr.length;j++){
        if (j!=arr[j]){
          return j;
        }
      }
    return arr.length;

    }
    static void cyclic(int[] arr){
      int i=0;
      while (i<arr.length){
        int correctInd=arr[i];
        if (arr[i]>=arr.length){
          i++;
        }
        else if (i!=correctInd){
          swap(arr,i,correctInd);
            
          
        }
        else{
          i++;

          }
          
        }
      }
        
      
    static void  swap(int[] arr,int start,int end){
      int temp=arr[start];
      arr[start]=arr[end];
      arr[end]=temp;
      
      }
        
   


}