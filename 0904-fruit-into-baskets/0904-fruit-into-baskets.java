class Solution {
    public int totalFruit(int[] fruits) {
        int max=0;
        int ws=0;
        int count=0;
        Map<Integer, Integer> m=new HashMap<>();
        for(int we=0; we<fruits.length; we++){
            m.put(fruits[we], m.getOrDefault(fruits[we],0)+1) ;
            while(m.size()>2){
                m.put(fruits[ws], m.get(fruits[ws])-1);
                if (m.get(fruits[ws])==0) {
                    m.remove(fruits[ws]);
                }
                ws++;
            }
            max=Math.max(max, we-ws+1);
        }
        return max;
    }
}