class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
    String r= sb.toString();
    int i=0;
    int j=r.length()-1;
    while(i<=j){
        if(r.charAt(i)!=r.charAt(j)){
            return false;
        }
        else{
            i++;
            j--;
        }
    }
    return true;
    }
}