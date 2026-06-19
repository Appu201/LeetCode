class Solution {
    public String frequencySort(String s) {
        String res="";
        Map<Character, Integer> m=new HashMap<>();
        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);
            m.put(ch, m.getOrDefault(ch,0)+1);
        }
        while (!m.isEmpty()) {
            int maxFreq = 0;
            char ans = ' ';
            for (char key : m.keySet()) {
                if (m.get(key) > maxFreq) {
                    maxFreq = m.get(key);
                    ans = key;
                }
            }
            for (int j=0; j<maxFreq; j++) {
                res += ans;
            }
            m.remove(ans);
        }
        return res;
    }
}