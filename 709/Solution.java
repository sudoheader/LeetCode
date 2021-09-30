class Solution {
    public String toLowerCase(String str) {
        String result = "";
        for(char c : s.toCharArray()) {
            if(Character.isUpperCase(c)) {
                result = result + (char)(c + 32);
            } else {
                result = result + c;
            }
        }
        return result;
    }
}
