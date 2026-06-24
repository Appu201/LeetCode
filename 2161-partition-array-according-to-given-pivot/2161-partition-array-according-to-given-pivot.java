class Solution {
    public int[] pivotArray(int[] nums,int pivot) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        ArrayList<Integer> l3=new ArrayList<>();
        for(int num:nums){
            if(num<pivot){
                l1.add(num);
            }else if(num==pivot){
                l2.add(num);
            }else{
                l3.add(num);
            }
        }
        l1.addAll(l2);
        l1.addAll(l3);
        int[] arr=new int[nums.length];
        for(int i=0;i<l1.size();i++){
            arr[i]=l1.get(i);
        }
        return arr;
    }
}