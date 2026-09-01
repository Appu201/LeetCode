class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map=new HashMap<>();
        HashSet<String> set=new HashSet<>();
        for(String s:arr){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        for(Map.Entry<String, Integer> entry:map.entrySet()) {
            if(entry.getValue()==1) {
                set.add(entry.getKey());
            }
        }
        int count=0;
        String ans="";
        for(String s:arr) {
            if (set.contains(s)) {
                count++;
                if (count==k) {
                    return s;
                }
            }
        }
        return "";
    }
}