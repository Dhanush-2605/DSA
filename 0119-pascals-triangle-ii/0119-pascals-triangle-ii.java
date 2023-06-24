class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<int[]> rows=new ArrayList<>();
        int[] cur=new int[1];
        cur[0]=1;
        rows.add(cur);
        for (int i=1;i<=rowIndex;i++){
            int[] prev=rows.get(rows.size()-1);
            int l=0;
            int r=1;
            int[] newRow=new int[i+1];
            newRow[0]=1;
            newRow[newRow.length-1]=1;
            int ind=1;
            for (int j=0;j<(i-1);j++){
                newRow[ind++]=prev[l]+prev[r];
                l++;
                r++;
                
                
            }
            rows.add(newRow);
        }
                List<Integer> temp=new ArrayList<>();

        for (int val:rows.get(rowIndex)) temp.add(val);
        return temp;
        
    }
}