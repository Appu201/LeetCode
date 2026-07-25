class Solution {
    public int maxProduct(int n) {
        int max=0;
        int temp=n;
        ArrayList<Integer> l=new ArrayList<>();
        while(temp!=0){
            int k=temp%10;
            temp/=10;
            l.add(k);
        }
        Integer[] arr = l.toArray(new Integer[0]);
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                max=Math.max(max, arr[i]*arr[j]);
            }
        }
        return max;
    }
}