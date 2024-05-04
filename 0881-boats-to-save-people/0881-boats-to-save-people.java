class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;

        int ctn = 0;
        int r=n-1;
        int l=0;

        while (r>=l) {
            ctn++;

            int sum= people[l] + people[r];
            if (sum<=limit){
                l++;
            }
            r--;
       
        }

        return ctn;
    }
}