class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> res = new ArrayList<>();
        recurse(s, wordDict, 0, "", res);
        return res;
    }

    static void recurse(String s, List<String> dict, int ind, String temp, List<String> res) {
        if (ind == s.length()) {
            res.add(temp.trim());
            return;
        }

        for (String cur : dict) {
            if (s.startsWith(cur, ind)) {
                recurse(s, dict, ind + cur.length(), temp + cur + " ", res);
            }
        }
    }
}