class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
            }
        }

        int maxFreq=0;
        int ans=-1;
        for (int key : m.keySet()) {
            if (m.get(key) > maxFreq) {
                maxFreq = m.get(key);
                ans = key;
            }
            else if (m.get(key)==maxFreq && key<ans) {
                ans=key;
            }
        }
        return ans;
    }
}