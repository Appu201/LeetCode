class Solution {
    public int characterReplacement(String s, int k) {
        int ans=0;
        for (char ch='A'; ch<='Z'; ch++) {
            int ws=0;
            int rep=0;
            for (int we=0; we<s.length(); we++) {
                if (s.charAt(we)!=ch){
                    rep++;
                }
                while (rep>k) {
                    if (s.charAt(ws)!=ch)
                        rep--;
                    ws++;
                }
                ans = Math.max(ans, we-ws+1);
            }
        }
        return ans;
    }
}

// class Solution {
//     public int characterReplacement(String s, int k) {
//         int[] freq = new int[26]; // Frequency of each character
//         int ws = 0;
//         int maxFreq = 0; // Highest frequency of any character in the current window
//         int max = 0;

//         for (int we = 0; we < s.length(); we++) {

//             // Increase frequency of current character
//             freq[s.charAt(we) - 'A']++;

//             // Update the maximum frequency in the current window
//             maxFreq = Math.max(maxFreq, freq[s.charAt(we) - 'A']);

//             // If more than k replacements are needed, shrink the window
//             while ((we - ws + 1) - maxFreq > k) {
//                 freq[s.charAt(ws) - 'A']--;
//                 ws++;
//             }

//             // Update the answer
//             max = Math.max(max, we - ws + 1);
//         }

//         return max;
//     }
// }