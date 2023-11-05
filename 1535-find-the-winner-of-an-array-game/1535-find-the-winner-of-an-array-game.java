class Solution {
    public int getWinner(int[] arr, int k) {
        ArrayList<Integer> temp=new ArrayList<>();
        for (int val:arr) temp.add(val);
        int win=arr[0];
        int ctn=0;
         int n=arr.length;
    for (int i=1;i<n;i++){
        if (win>arr[i]){
            ctn++;
            
        }
        else{
            ctn=1;
            win=arr[i];

        }
        if (ctn==k) return win;


}
return win;
    }
}


      