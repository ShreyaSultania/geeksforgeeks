class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        // code here
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        int i=0;
        int sum=0;
        int j=0;
        while(j<n){
            sum+=arr[j];
            while(sum>x){
                min=Math.min(j-i+1,min);
                sum-=arr[i];
                i++;
            }
            
            j++;
        }
        if(min==Integer.MAX_VALUE) return 0;
        return min;
    }
}
