class Solution {
    public String longestPalindrome(String s) {

        String ans = "";

        for(int i = 0; i < s.length(); i++) {

            for(int j = s.length(); j > i; j--) {

                String sub = s.substring(i,j);

                if(ispal(sub)) {

                    if(sub.length() > ans.length()) {
                        ans = sub;
                    }
                }
            }
        }

        return ans;
    }

    public boolean ispal(String p) {

        int a = 0;
        int b = p.length()-1;

        while(a < b) {

            if(p.charAt(a) != p.charAt(b)) {
                return false;
            }

            a++;
            b--;
        }

        return true;
    }
}