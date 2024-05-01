class Pair{
    String s;
    int ctn;
    Pair (String _s,int _c){
        this.s=_s;
        this.ctn=_c;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(beginWord,1));
        Set<String> set=new HashSet<>();
        for (String st:wordList) set.add(st);
        set.remove(beginWord);
        while (!q.isEmpty()){
            String word=q.peek().s;
            int step=q.peek().ctn;
            q.remove();
            if (word.equals(endWord)==true ) return step;
            for (int i=0;i<word.length();i++){
                for (char ch='a';ch<='z';ch++){
                    char[] chr=word.toCharArray();

                    chr[i]=ch;
                    String nWord=new String(chr);

                    if (set.contains(nWord)){
                        q.add(new Pair(nWord,step+1));
                        set.remove(nWord);
                    }
                }
            }
                
        }
        return 0;
    }
}