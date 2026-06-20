class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>>l= new ArrayList<>();
        Map <Integer, List<Integer>> m=new HashMap<>();
        for(int i=0; i<groupSizes.length; i++){
            int size=groupSizes[i];
            if(!m.containsKey(size)){
                m.put(size, new ArrayList<>());
            }
            m.get(size).add(i);
            if(m.get(size).size()==size){
                l.add(new ArrayList<>(m.get(size)));
                m.put(size, new ArrayList<>());
            }
        }
        return l;
    }
}