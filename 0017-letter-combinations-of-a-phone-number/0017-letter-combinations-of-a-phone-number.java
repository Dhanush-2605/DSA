class Solution {
    public List<String> letterCombinations(String digits) {
    List<String> res=new ArrayList<>();
    HashMap<Integer,String> map=new HashMap<>();
    map.put(2,"abc");
    map.put(3,"def");
    map.put(4,"ghi");
    map.put(5,"jkl");
    map.put(6,"mno");
    map.put(7,"pqrs");
    map.put(8,"tuv");
    map.put(9,"wxyz");

    if (digits.length()==0) return res;
           recurse(0,"",map,digits,res);

        return res;
        
    }
    void recurse(int i,String cur,HashMap<Integer,String> map,String digits,List<String> res){
        if (cur.length()==digits.length()){
            res.add(cur);
            return;
        }
        String curStr=map.get(Character.getNumericValue(digits.charAt(i)));
        for (char ch:curStr.toCharArray()){
            recurse(i+1,cur+ch,map,digits,res);
        }
    }
}