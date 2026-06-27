class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result=new StringBuilder();
        for(String w:words){
            int sumWeight=0;
            for(char ch:w.toCharArray()){
                sumWeight+=weights[ch-'a'];
            }
            int val=sumWeight%26;
            result.append((char)('z'-val));
        }
        return result.toString();
    }
}