class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        String org = "";
        String rev = "";

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
                org += ch;
            }
        }

        for(int j = org.length() - 1; j >= 0; j--){
            rev += org.charAt(j);
        }

        return org.equals(rev);
    }
}