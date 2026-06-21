class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int num:nums1){
            m.put(num, m.getOrDefault(num, 0) + 1);
        }
        List<Integer> res = new ArrayList<>();
        for(int num :nums2){
            if(m.getOrDefault(num, 0)>0){
                res.add(num);
                m.put(num, m.get(num)-1);
            }
        }
        int[] ans = new int[res.size()];
        for(int i=0; i<res.size(); i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
}