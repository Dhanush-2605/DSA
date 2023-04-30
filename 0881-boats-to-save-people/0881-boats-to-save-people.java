class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int cur=limit;
        int n=people.length;
        int boat=0;
        int l=0;
        int r=n-1;
        while (r>=l){
            int sum=people[l]+people[r];
            boat++;
            if (sum<=limit){
                l++;
            }
            r--;          
    }
  
        return boat;
        
    }
}