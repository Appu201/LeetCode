class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String one="", two="", three="";
        for(char ch:firstWord.toCharArray()){
            one+=ch-'a';
        }
        for(char ch:secondWord.toCharArray()){
            two+=ch-'a';
        }
        for(char ch:targetWord.toCharArray()){
            three+=ch-'a';
        }
        if(Integer.parseInt(one)+Integer.parseInt(two)==Integer.parseInt(three)){
            return true;
        }
        return false;
    }
}