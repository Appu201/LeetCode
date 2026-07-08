class Solution {
    public String reverseWords(String s) {
        String result = "";
        String[] words = s.trim().split("\\s+");

        for(int i = words.length - 1; i >= 0; i--) {
            result += words[i];
            if(i != 0) {
                result += " ";
            }
        }

        return result;
    }
}