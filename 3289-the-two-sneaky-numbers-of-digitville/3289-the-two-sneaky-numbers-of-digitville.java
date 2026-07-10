class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> m=new HashMap<>();
        for(int n:nums){
            m.put(n, m.getOrDefault(n,0)+1);
        }
        List<Integer> l= new ArrayList<>();
        for (int key : m.keySet()) {
            if (m.get(key)==2) {
            l.add(key);
            }
        }
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}