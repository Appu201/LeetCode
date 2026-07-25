class Solution {
    public String firstPalindrome(String[] words) {
        String ans="";
        for(String s:words){
            StringBuilder sb=new StringBuilder(s);
            sb.reverse();
            if(s.equals(sb.toString())){
                return s;
            }
        }
        return ans;
    }
}