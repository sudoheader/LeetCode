class Solution {
    public boolean backspaceCompare(String s, String t) {
        int s_pointer = s.length() - 1;
        int t_pointer = t.length() - 1;

        int s_skips = 0;
        int t_skips = 0;

        while(s_pointer >= 0 || t_pointer >= 0) {

            while(s_pointer >= 0) {
                if(s.charAt(s_pointer) == '#') {
                    s_skips += 1;
                    s_pointer -= 1;
                } else if (s_skips > 0) {
                    s_pointer -= 1 ;
                    s_skips -= 1;
                } else {
                    break;
                }
            }

            while(t_pointer >= 0) {
                if(t.charAt(t_pointer) == '#') {
                    t_skips += 1;
                    t_pointer -= 1;
                } else if (t_skips > 0) {
                    t_pointer -= 1 ;
                    t_skips -= 1;
                } else {
                    break;
                }
            }

            if(s_pointer >= 0 && t_pointer >= 0 && s.charAt(s_pointer) != t.charAt(t_pointer)) {
                return false;
            }

            if((s_pointer >= 0) != (t_pointer >= 0)) {
                return false;
            }

            s_pointer -= 1;
            t_pointer -= 1;
        }

        return true;
    }
}
