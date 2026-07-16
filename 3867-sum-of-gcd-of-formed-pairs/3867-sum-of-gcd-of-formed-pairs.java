class Solution {
    public static int findGCD(int a, int b) {
        if(b==0)
            return a;
        return findGCD(b, a % b);
    }
    public long gcdSum(int[] nums) {
        long sum=0;
        int arr[]=new int[nums.length];
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            arr[i] = findGCD(nums[i], max);
        }
        Arrays.sort(arr);
        int s=0;
        int f=nums.length-1;
        while(s<f){
            sum+=findGCD(arr[s], arr[f]);
            s++;
            f--;
        }
        return sum;
    }
}