class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map <Character, Integer> m=new HashMap<>();
        for(char ch : magazine.toCharArray()){
            m.put(ch, m.getOrDefault(ch, 0)+1);
        }
        for(char ch : ransomNote.toCharArray()){
            if(!m.containsKey(ch)){
                return false;
            }
            m.put(ch, m.get(ch)-1);
            if (m.get(ch)==0) {
                m.remove(ch);
            }
        }
        return true;
    }
}