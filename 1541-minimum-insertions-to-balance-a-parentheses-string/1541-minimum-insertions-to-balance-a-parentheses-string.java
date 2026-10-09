class Solution {
    public int minInsertions(String s) {
        int open=0;
        int need=0;
        int n=s.length();
        int i=0;

        while(i<n){
            if(s.charAt(i)=='('){
                open++;
                i++;
            }
            else{
                if(i+1<n && s.charAt(i+1)==')'){
                    i+=2;
                }
                else{
                    need++;
                    i++;
                }

                if(open>0){
                    open--;
                }
                else{
                    need++;
                }
            }
        }
        return need+open*2;
    }
}