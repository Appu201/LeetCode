class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        int count=0;
        String k="";
        HashMap<String,Integer> map=new HashMap<>();
        for(int we=0; we<s.length(); we++){
            k+=s.charAt(we);
            if(k.length()>=minSize&&k.length()<=maxSize){
                HashSet<Character> set=new HashSet<>();
                for(char ch:k.toCharArray()){
                    set.add(ch);
                }
                if(set.size()<=maxLetters){
                    map.put(k,map.getOrDefault(k,0)+1);
                    count=Math.max(count,map.get(k));
                }
                k=k.substring(1);
            }
        }
        return count;
    }
}