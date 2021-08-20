class Solution {
    public String toLowerCase(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            int ascii = (char)str.charAt(i);
            if(ascii >=65 && ascii <= 90) {
                ascii = ascii+32;
                result += Character.toString((char)ascii);
            } else {
                result += str.charAt(i);
            }
            
        }
       
        return result;
    }
}
