class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int i=0;
        Stack<Integer> stack=new Stack<>();        
        while (i<asteroids.length){        
            
            int elem=asteroids[i];
            if (elem>0) stack.push(elem);
            else {
                while (!stack.isEmpty() && stack.peek()>0 && stack.peek()<Math.abs(elem)){
                    stack.pop();
                }
                if (stack.isEmpty() || stack.peek()<0) stack.push(elem);
                if (stack.peek()==Math.abs(elem)) stack.pop();
            }         
            i++;
            
        }
        int[] arr=new int[stack.size()];      
  
        for (int j=stack.size()-1;j>=0;j--){
                        arr[j]=stack.pop();

        }
     
      

        return arr;
        
    }
}