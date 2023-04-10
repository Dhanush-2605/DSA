class Solution {
    public List<String> commonChars(String[] words) {
        int[] common=new int[26];
        List<String> res=new ArrayList<>();
        Arrays.fill(common,Integer.MAX_VALUE);
        for (String word:words){
            int[] cnt=new int[26];
            for (char ch:word.toCharArray()){
                cnt[ch-'a']++;
            }
            for (int i=0;i<26;i++){
                common[i]=Math.min(common[i],cnt[i]);
            }
        }
        for (int i=0;i<26;i++){
            for (int j=0;j<common[i];j++){
                res.add(""+((char)(i+'a')));
            }
        }
        return res;
    }
}