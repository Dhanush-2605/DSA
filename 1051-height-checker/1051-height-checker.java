class Solution {
    public int heightChecker(int[] heights) {
    int n = heights.length;
    int backup[] = new int[n];  
    for (int i = 0; i < n; i++)
        backup[i] = heights[i];
    Arrays.sort(heights);
    
    int count = 0;
    for(int i = 0; i < n; i++){ 
        if(heights[i] != backup[i]) count++;
    }
    return count;
}
}