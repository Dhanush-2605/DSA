public class HouseRobber {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
         System.out.println(func(nums));
        
    }
    static int func(int[] nums){
        int r1=0;
        int r2=0;
        for (int n:nums){
            int temp=Math.max(n+r1,r2);
            r1=r2;
            r2=temp;
        }
    return r2;

    }
}
