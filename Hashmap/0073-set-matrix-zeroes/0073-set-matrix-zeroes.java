
class Solution {   

    
    public void setZeroes(int[][] matrix) {
    int row=matrix.length;
    int col=matrix[0].length;
    HashMap<ArrayList<Integer>,Boolean> map=new HashMap<>();
    for (int i=0;i<row;i++){
        for (int j=0;j<col;j++){
            String ind="";
            ind+=String.valueOf(i)+String.valueOf(j);
            ArrayList<Integer> l=new ArrayList<>();
            l.add(i);
            l.add(j);
            if (matrix[i][j]==0){                
                map.put(l,true);
            }
        }
    }
 for (Map.Entry<ArrayList<Integer>,Boolean> mapElement : map.entrySet()) {
            fillZeros(mapElement.getKey().get(0),mapElement.getKey().get(1),matrix,row,col);

        
        }       


    
    }
void fillZeros(int r,int c,int[][] res,int row,int col){
    for (int i=0;i<col;i++){
        res[r][i]=0;
    }
    for (int j=0;j<row;j++){
        res[j][c]=0;
    }
}
}