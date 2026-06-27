class Solution {
        public int numIdenticalPairs(int[] A) {
        int ans = 0;
        int arr[] = new int[101];
        for (int a:A) {
            ans+=arr[a]++;
        }
        return ans;
    }
}