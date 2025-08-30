class Solution {
   static boolean fun(int arr[],int target,int idx,int dp[][]){
        if(idx==arr.length) {
            if(target==0) return true;
             else return false;
        }
        if(dp[target][idx]!=-1) {
            return dp[target][idx]==1;
        }
        boolean ans=false;
        boolean skip=fun(arr,target,idx+1,dp);
        if(target-arr[idx]<0){
            ans=skip;
        }
        else{
            boolean take=fun(arr,target-arr[idx],idx+1,dp);
        ans=skip||take;
        }
        if(ans) dp[target][idx]=1;
        else dp[target][idx]=0;
        return ans;
    }
    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int dp[][]=new int[sum+1][arr.length];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return fun(arr,sum,0,dp);
    }
}