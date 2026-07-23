class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length+nums2.length];
        int idx=0;
        for(int i=0; i<nums1.length; i++){
            arr[idx]=nums1[i];
            idx++;
        }
        for(int i=0; i<nums2.length; i++){
            arr[idx]=nums2[i];
            idx++;
        }
        Arrays.sort(arr);
        if(arr.length%2!=0){
            double ans=arr[arr.length/2];
            return ans;
        }
        else{
            double ans=(arr[arr.length/2-1]+arr[arr.length/2])/2.0;
            return ans;
        }
    }
}