class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;
        Map<Character, String> m1=new HashMap<>();
        Map<String, Character> m2=new HashMap<>();
        for(int i=0; i<pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];
            if(m1.containsKey(ch) && !m1.get(ch).equals(word))
                return false;
            if(m2.containsKey(word) && m2.get(word)!=ch)
                return false;
            m1.put(ch, word);
            m2.put(word, ch);
        }
        return true;
    }
}