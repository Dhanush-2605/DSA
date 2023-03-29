class Solution {
    public int[] separateDigits(int[] nums) {
        
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int x : nums) {

            while (x > 0) {
                int rem = x % 10;
                stack.push(rem);
                x /= 10;
            }
            
            while (!stack.isEmpty()) {
                list.add(stack.pop());
            }
        }

        int index = 0;
        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[index++] = list.get(i);
        }
        return ans;
    }
}
