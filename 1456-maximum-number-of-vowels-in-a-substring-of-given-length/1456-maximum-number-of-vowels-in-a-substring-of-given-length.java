class Solution {
    public int maxVowels(String s, int k) {
        int l=0;
        int len=s.length();
        int e=k-1;
        ArrayList<Character> vowels=new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int v=0;
        for (int i=0;i<k;i++){
            if (vowels.contains(s.charAt(i))) v++;            
        }
                int cur=v;

        while (e+1<len){
             e++;
            char next=s.charAt(e);
            char prev=s.charAt(l);
            l++;
            if (vowels.contains(next)) cur++;        
            if (vowels.contains(prev)) cur--;
            v=Math.max(v,cur);
        }
     return v;   
    }
}