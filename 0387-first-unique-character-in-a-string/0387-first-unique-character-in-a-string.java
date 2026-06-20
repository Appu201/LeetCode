class Solution {
    public int firstUniqChar(String s) {
        Map <Character, Integer> m = new HashMap<>();
        char ch[] = s.toCharArray();
        for(char c:ch){
            m.put(c, m.getOrDefault(c, 0)+1);
        }
        for (int i=0; i<ch.length; i++) {
            if (m.get(ch[i])==1) {
                return i;
            }
        }
        return -1;
    }
}