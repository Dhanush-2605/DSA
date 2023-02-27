class Pair{
    String s;
    int c;
    Pair(String _s,int _c){
        this.s=_s;
        this.c=_c;
        
    }
}

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q=new LinkedList<>();
        Set<String> set=new HashSet<>();
        for (String word:wordList) set.add(word);
        q.add(new Pair(beginWord,1));
        set.remove(beginWord);
        while (!q.isEmpty()){
            String curWord=q.peek().s;
            int count=q.peek().c;
            q.remove();
            if (curWord.equals(endWord)) return count;
            for (int i=0;i<curWord.length();i++){
                for (char ch='a';ch<='z';ch++){
                    char[] curArr=curWord.toCharArray();
                    curArr[i]=ch;
                    String newWord=new String(curArr);
                    if (set.contains(newWord)==true){
                        set.remove(newWord);
                        q.add(new Pair(newWord,count+1));
                    }
                }
            }
        }
            
        return 0;
        
    }
}