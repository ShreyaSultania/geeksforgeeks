class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n=arr.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            max=Math.max(max,sum);
            if(sum<0){
                max=Math.max(sum,max);
                sum=0;
            }
        }
        return max;
    }
}
