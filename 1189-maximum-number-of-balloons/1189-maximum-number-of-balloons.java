class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> m = new HashMap<>();
        int count=0;
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)=='b'||text.charAt(i)=='a'||text.charAt(i)=='l'||text.charAt(i)=='o'||text.charAt(i)=='n'){
                m.put(text.charAt(i), m.getOrDefault(text.charAt(i),0)+1);
            }
            if (m.getOrDefault('b', 0)>=1&&m.getOrDefault('a', 0)>=1&&m.getOrDefault('l', 0)>=2&&m.getOrDefault('o', 0)>=2&&m.getOrDefault('n', 0)>=1){
                count++;
                m.put('b', m.get('b') - 1);
                m.put('a', m.get('a') - 1);
                m.put('l', m.get('l') - 2);
                m.put('o', m.get('o') - 2);
                m.put('n', m.get('n') - 1);
            }
        }
        return count;
    }
}