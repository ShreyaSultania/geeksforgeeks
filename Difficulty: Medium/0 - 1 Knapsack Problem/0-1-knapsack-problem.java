class Solution {
    static int helper(int C,int val[],int wt[],int idx,int dp[][]){
        if(idx>=wt.length) return 0;
        if(dp[C][idx]!=-1) return dp[C][idx];
        int skip=helper(C,val,wt,idx+1,dp);
        if(wt[idx]>C) return dp[C][idx]=skip;
        int take=val[idx]+helper(C-wt[idx],val,wt,idx+1,dp);
        return dp[C][idx]=Math.max(take,skip);
    }
    static int knapsack(int C, int val[], int wt[]) {
        // memoisation
        int n=wt.length;
        int dp[][]=new int[C+1][n+1]; //depends on how many variables are going to change and which variable
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return helper(C,val,wt,0,dp);
    }
}
