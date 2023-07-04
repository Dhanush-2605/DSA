class Solution {
    public boolean buddyStrings(String s, String goal) {
        int n1=s.length();
        int n2=goal.length();
        if (n1!=n2) return false;
        ArrayList<Integer> top=new ArrayList<>();
        
        if (s.equals(goal)){
            int[] freq=new int[26];
            for (int i=0;i<n1;i++){
                int ind=s.charAt(i)-'a';                
                freq[ind]++;
                if (freq[ind]==2) return true;
            }
            return false;
            
        }
        for (int i=0;i<n1;i++){
            if (s.charAt(i)!=goal.charAt(i)) top.add(i);
            if (top.size()>2) return false;
        }
        return top.size()==2 && s.charAt(top.get(0))==goal.charAt(top.get(1)) && s.charAt(top.get(1))==goal.charAt(top.get(0));
        
        
    }
}