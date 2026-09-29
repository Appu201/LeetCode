class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1||numRows>=s.length()) return s;
        int row=0; 
        boolean k=true;
        StringBuilder arr[]=new StringBuilder[numRows];
        for(int i=0; i<numRows; i++){
            arr[i]=new StringBuilder();
        }
        for(char c:s.toCharArray()){
            arr[row].append(c);
            if(row==0){
                k=true;
            }
            else if(row==numRows-1){
                k=false;
            }
            if(k) row++;
            else row--;
        }
        StringBuilder ans=new StringBuilder();
        for(StringBuilder x:arr){
            ans.append(x);
        }
        return ans.toString();
    }
}