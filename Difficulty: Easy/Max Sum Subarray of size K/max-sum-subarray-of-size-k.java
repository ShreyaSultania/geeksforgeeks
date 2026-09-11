class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int i=0;
        int j=0;
        int n=arr.length;
        int sum=0;
        int max=0;
        while(j<n){
            if(j-i+1>k){
                sum-=arr[i];
                i++;
            }
            sum+=arr[j];
            max=Math.max(sum,max);
            j++;
        }
        return max;
    }
}