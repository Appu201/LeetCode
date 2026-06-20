class Solution {
    public int subarraySum(int[] nums, int k) {
        Map <Integer, Integer> m=new HashMap<>();
        int sum=0, count=0;
        m.put(0,1);
        for(int num:nums){
            sum+=num;
            count+=m.getOrDefault(sum-k,0);
            m.put(sum, m.getOrDefault(sum,0)+1);
        }
        return count;
    }
}