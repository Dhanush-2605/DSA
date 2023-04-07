class Solution {
    public int numJewelsInStones(String jewels, String stones) {
		HashMap<Character,Integer> m1=new HashMap<>();
		for (char ch:stones.toCharArray()){
		    if (m1.containsKey(ch)) m1.put(ch,m1.get(ch)+1);
		    else m1.put(ch,1);
		}
		int ans=0;
		for (char ch:jewels.toCharArray()){
            if (m1.containsKey(ch)) ans+=m1.get(ch);
		}
        return ans;
        
    }
}