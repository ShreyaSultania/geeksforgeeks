// User function Template for Java

class Solution {
    static boolean helper(int n,int arr[],int target,int sum,int idx){
        if(sum==target) return true;
        if(idx==arr.length){
            return false;
        }
        if(sum>target) return false;
        
        return helper(n,arr,target,sum+arr[idx],idx+1) || helper(n,arr,target,sum,idx+1); //skip
        
    }
    public static boolean checkSubsequenceSum(int n, int[] arr, int K) {
        // code here
        
        return helper(n,arr,K,0,0);
    }
}
