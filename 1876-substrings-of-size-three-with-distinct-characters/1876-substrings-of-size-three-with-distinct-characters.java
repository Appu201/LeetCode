class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        String k="";
        for(int we=0; we<s.length(); we++){
            k+=s.charAt(we);
            if(k.length()==3){
                HashSet<Character> set=new HashSet<>();
                for(char ch:k.toCharArray()){
                    set.add(ch);
                }
                if(set.size()==3){
                    count++;
                }
                k=k.substring(1);
            }
        }
        return count;
    }
}