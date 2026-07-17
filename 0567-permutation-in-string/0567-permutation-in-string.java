class Solution {
    public boolean checkInclusion(String s1, String s2) {
        List<Integer> l=new ArrayList<>();
        if(s2.length()>s2.length()) return false;
        int freq[]=new int[26];
        int wfreq[]=new int[26];
        for(int i=0; i<s1.length(); i++){
            freq[s1.charAt(i)-'a']++;
        }
        int ws=0;
        for(int we=0; we<s2.length(); we++){
            wfreq[s2.charAt(we)-'a']++;
            if(we-ws+1>s1.length()){
                wfreq[s2.charAt(ws)-'a']--;
                ws++;
            }
            if(we-ws+1==s1.length()){
                if(isSame(freq, wfreq)){
                    l.add(ws);
                }
            }
        }
        if(l.isEmpty()) return false;
        return true;
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