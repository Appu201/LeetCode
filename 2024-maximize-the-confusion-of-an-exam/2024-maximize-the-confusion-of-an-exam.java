class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int max=0;
        int rep=0;
        int ws=0;
        for(int we=0; we<answerKey.length(); we++){
            if(answerKey.charAt(we)=='T'){
                rep++;
            }
            while(rep>k){
                if(answerKey.charAt(ws)=='T'){
                    rep--;
                }
                ws++;
            }
            max=Math.max(max, we-ws+1);
        }
        int frep=0;
        int fws=0;
        for(int fwe=0; fwe<answerKey.length(); fwe++){
            if(answerKey.charAt(fwe)=='F'){
               frep++;
            }
            while(frep>k){
                if(answerKey.charAt(fws)=='F'){
                    frep--;
                }
                fws++;
            }
            max=Math.max(max, fwe-fws+1);
        }
        return max;
    }
}