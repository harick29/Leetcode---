class Solution {
    public int maxVowels(String s, int k) {
        int c=0;
        for(int i=0;i<k;i++){
            if(isVovel(s.charAt(i))){
                c++;
            }
        }
        int max=c;
        for(int i=k;i<s.length();i++){
            if(isVovel(s.charAt(i))){
                c++;
            }
            if(isVovel(s.charAt(i-k))){
                c--;
            }
            max=Math.max(max, c);
        }
        return max;

    }
    public boolean isVovel(char s){
        return s=='a'||
        s=='e'||
        s=='i'||
        s=='o'||
        s=='u';
    }
}