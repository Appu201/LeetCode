class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map <Integer, Integer> m = new HashMap<>();
        m.put(0, 1);
        int count=0;
        int oddCount=0;
        for (int num:nums) {
            if (num%2!=0) {
                oddCount++;
            }
            count+=m.getOrDefault(oddCount-k, 0);
            m.put(oddCount, m.getOrDefault(oddCount, 0)+1);
        }
        return count;
    }
}