class Solution {
    public int nthUglyNumber(int n) {
        TreeSet<Long> possible=new TreeSet<>();
        possible.add((long)1);
        int c=0;
        long ans=1;
        while (c!=n){
            long nextNum=possible.pollFirst();
            ans=nextNum;
            ++c;
            possible.add(2*nextNum);
            possible.add(3*nextNum);
            possible.add(5*nextNum);

        }
        return (int)ans;
        
    }
}