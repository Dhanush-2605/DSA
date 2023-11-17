class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int res=0;
        Arrays.sort(people);
        int l=0;
        int r=people.length-1;
        while (r>=l){
            int sum=people[l]+people[r];
            if (limit>=sum){
                l++;
                r--;
                res++;
            }
            else{
                r--;
                res++;
            }
        }
        return res;
    }
}