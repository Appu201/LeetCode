class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        HashSet<Character> s = new HashSet<>();
        for(char ch:allowed.toCharArray()){
            s.add(ch);
        }
        for(String str:words){
            boolean valid = true;
            for(char ch:str.toCharArray()){
                if(!s.contains(ch)){
                    valid = false;
                    break;
                }
            }
            if(valid){
                count++;
            }
        }
        return count++;
    }
}