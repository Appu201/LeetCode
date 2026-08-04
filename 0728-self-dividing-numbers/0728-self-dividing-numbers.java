import java.util.*;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l = new ArrayList<>();
        
        for(int i=left; i<=right; i++) {
            int temp=i;
            boolean ok=true;
            
            while(temp!=0) {
                int d=temp % 10;
                if(d==0 || i%d!=0) {
                    ok=false;
                    break;
                }
                temp/=10;
            }   
            if(ok) l.add(i);
        }
        return l;
    }
}