class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();
        int max_length = 0;
        int start = 0;

        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if(map.containsKey(curr)) {
                start = Math.max(map.get(curr) + 1, start);
            }
            map.put(curr, i);
            max_length = Math.max(i - start + 1, max_length);
        }
        return max_length;
    }
}
