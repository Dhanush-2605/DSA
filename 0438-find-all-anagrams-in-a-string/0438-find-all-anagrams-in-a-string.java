class Solution {
    private int windowSize(int left, int right) {
        return right - left;
    }

    public List<Integer> findAnagrams(String s, String p) {
        // Result list
        List<Integer> result                    = new ArrayList<>();
        Map<Character, Integer> pOccurrencesMap      = new HashMap<>();
        Map<Character, Integer> windowOccurrencesMap = new HashMap<>();
        int left = 0, right = 0;

        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            pOccurrencesMap.put(c, pOccurrencesMap.getOrDefault(c, 0) + 1);
        }

        while (right < s.length()) {
            char rightChar = s.charAt(right);
            windowOccurrencesMap.put(rightChar, windowOccurrencesMap.getOrDefault(rightChar, 0) + 1);

            right++;

            if (windowSize(left, right) == p.length()) {
                if (windowOccurrencesMap.equals(pOccurrencesMap)) {
                    result.add(left);
                }
              
                char leftChar = s.charAt(left);
                if (windowOccurrencesMap.containsKey(leftChar)) {
                    windowOccurrencesMap.put(leftChar, windowOccurrencesMap.get(leftChar) - 1);
                    if (windowOccurrencesMap.get(leftChar) == 0) {
                        windowOccurrencesMap.remove(leftChar);
                    }
                    left++;
                }
            }
        }

        return result;
    }
}