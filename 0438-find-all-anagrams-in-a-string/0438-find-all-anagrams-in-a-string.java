class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> l=new ArrayList<>();
        if(p.length()>s.length()) return l;
        int freq[]=new int[26];
        int wfreq[]=new int[26];
        for(int i=0; i<p.length(); i++){
            freq[p.charAt(i)-'a']++;
        }
        int ws=0;
        for(int we=0; we<s.length(); we++){
            wfreq[s.charAt(we)-'a']++;
            if(we-ws+1>p.length()){
                wfreq[s.charAt(ws)-'a']--;
                ws++;
            }
            if(we-ws+1==p.length()){
                if(isSame(freq, wfreq)){
                    l.add(ws);
                }
            }
        }
        return l;
    }
    public boolean isSame(int[] a, int[] b) {
        for (int i=0; i<26; i++) {
            if (a[i]!=b[i]) {
                return false;
            }
        }
        return true;
    }
}