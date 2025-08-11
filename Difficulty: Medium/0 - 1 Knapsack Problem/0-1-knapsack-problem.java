class Solution {
    public static int profit(int i,int W,int[]val,int[]wt,int [][]dp){
        if(i>=val.length) return 0;
        if(dp[i][W]!=-1) return dp[i][W];
        int skip=profit(i+1,W,val,wt,dp);
        if(wt[i]>W) return dp[i][W]=skip;
        int take=val[i]+profit(i+1,W-wt[i],val,wt,dp);
        return dp[i][W]=Math.max(skip,take);
    }
    static int knapsack(int W, int val[], int wt[]) {
        int dp[][]=new int[wt.length][W+1];
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }
      
        return profit(0,W,val,wt,dp);
        // code here
        // int m=W;
        // int n=wt.length;
        // int dp[][]=new int[n+1][m+1];
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         if(wt[i-1]>j){
        //             dp[i][j]=dp[i-1][j];
        //         }
        //         else{
        //             dp[i][j]=Math.max(dp[i-1][j],val[i-1]+dp[i-1][j-wt[i-1]]);
        //         }
        //     }
        // }
        // return dp[n][m];
    }
}
