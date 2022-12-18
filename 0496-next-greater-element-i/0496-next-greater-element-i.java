class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int[] res=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums1.length;i++) map.put(nums1[i],i);
        Stack<Integer> stack=new Stack<>();
        int m=nums2.length-1;
        int ind=n-1;
        for (int i=m;i>=0;i--){
            // stack.push(nums2[i]);

            if (map.containsKey(nums2[i])){
                System.out.println(nums2[i]);
            while (!stack.isEmpty() && nums2[i]>=stack.peek()) stack.pop();
            if (!stack.isEmpty()){
                res[map.get(nums2[i])]=stack.peek();
                ind--;
            }else{
                res[map.get(nums2[i])]=-1;
                ind--;
            
            }
            // ind--;    
        }
        stack.push(nums2[i]);

        
    }
    return res;
    }
}