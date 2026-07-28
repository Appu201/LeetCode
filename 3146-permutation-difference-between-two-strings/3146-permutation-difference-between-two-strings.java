class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character, Integer> m= new HashMap<>();
        for(int i=0; i<t.length(); i++){
            m.put(t.charAt(i), i);
        }
        int ans=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            ans+=Math.abs(m.get(ch)-i);
        }
        return ans;
    }
}