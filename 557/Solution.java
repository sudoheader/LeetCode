class Solution {
    public String reverseWords(String s) {
        int i = 0, j = 0;
        int n = s.length();
        char[] charArr = s.toCharArray();
        while(i < n && j < n) {
            while(i < n && charArr[i] == ' ') {
                i++;
            }
            j = i;
            while(j < n && charArr[j] != ' ') {
                j++;
            }
            reverse(charArr, i, j - 1);
            i = j;
        }
        return new String(charArr);
    }

    private void reverse(char[] charArr, int s, int t) {
        while(s < t) {
            char tmp = charArr[s];
            charArr[s] = charArr[t];
            charArr[t] = tmp;
            s++;
            t--;
        }
    }
}
