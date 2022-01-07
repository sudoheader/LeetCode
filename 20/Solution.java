class Solution {
    public boolean isValid(String s) {
        if(s == null) return false;
        if(s.length() == 0) return true;

        Stack<Character> st = new Stack<>();
        char[] charArray = s.toCharArray();

        for(char ch: charArray) {
            switch(ch) {
                case '(':
                case '{':
                case '[': st.push(ch);
                    break;
                case ')': if(st.size() == 0 || st.pop() != '(') return false;
                    break;
                case '}': if(st.size() == 0 || st.pop() != '{') return false;
                    break;
                case ']': if(st.size() == 0 || st.pop() != '[') return false;
                    break;
                default : return false;
            }
        }
        return st.size() == 0;
    }
}
