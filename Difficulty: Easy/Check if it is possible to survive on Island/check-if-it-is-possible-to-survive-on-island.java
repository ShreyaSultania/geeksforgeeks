// User function Template for Java

class Solution {
    static int minimumDays(int S, int N, int M) {
        // code here
        if (S > 6 && 6 * (N - M) < M) return -1;
        int Sundays=S/7;
        int buyingDays=S-Sundays;
        int totalFood=S*M;
         int ans=0;
        
        if(totalFood%N==0) ans=totalFood/N;
        else ans=totalFood/N+1;
        if(ans<=buyingDays) return ans;
        return -1;
    }
    
}