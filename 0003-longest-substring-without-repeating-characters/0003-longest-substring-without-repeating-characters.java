class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=0;
        StringBuffer si = new StringBuffer("");
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int j=si.indexOf(String.valueOf(c));
            if(j!=-1){
                si.delete(0,j+1);
            }
            si.append(c);
            len=Math.max(len, si.length());
        }
        return len;

    }
}