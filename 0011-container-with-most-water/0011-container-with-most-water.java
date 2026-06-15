class Solution {
    public int maxArea(int[] a) {
        int l=0, r=a.length-1;
        int max=0;

        while (l<r) {
            int area = (r-l)*Math.min(a[l], a[r]);
            max = Math.max(max, area);

            if (a[l]<a[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}