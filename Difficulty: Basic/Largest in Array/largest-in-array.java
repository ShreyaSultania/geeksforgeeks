class Solution {
   static int max(int []arr,int n,int idx,int largest){
        if(n==idx) return largest;
       return max(arr,n,idx+1,Math.max(largest,arr[idx]));
    }
    public static int largest(int[] arr) {
        // code here
        return max(arr,arr.length,0,Integer.MIN_VALUE);
    }
}
