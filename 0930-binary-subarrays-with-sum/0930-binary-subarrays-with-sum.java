class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map <Integer, Integer> m = new HashMap<>();
        m.put(0,1);
        int sum=0, count=0;
        for(int num:nums){
            sum+=num;
            count+= m.getOrDefault(sum-goal, 0);
            m.put(sum, m.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}