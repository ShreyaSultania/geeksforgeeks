class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int i=0;
        int j=0;
        int n=arr.length;
        int sum=0;
        int maxSum=0;
        while(j<n){
            sum+=arr[j];
            if(j-i>=k){
                sum-=arr[i];
                i++;
            }
            maxSum=Math.max(maxSum,sum);
            j++;
        }
        return maxSum;
    }
}