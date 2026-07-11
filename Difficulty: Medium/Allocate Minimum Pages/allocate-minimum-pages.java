class Solution {
    public int findPages(int[] arr, int k) {
        // code here
         int n=arr.length;
         if(n<k) return -1;
         long high=0;
           long low=0;
         for(int i=0;i<n;i++){
             low=Math.max(low,arr[i]);
             high+=arr[i];
         }
         long ans=-1;
         while(low<=high){
             long mid = low + (high - low) / 2;
             int student=1;
             long sum=0;
             for(int i=0;i<n;i++){
                 if(sum+arr[i]>mid){
                     student++;
                     sum=arr[i];
                 }
                 else{
                     sum+=arr[i];
                 }

             }
             if(student>k){
                 low=mid+1;
             }
             else{
                  ans=mid;
                 high=mid-1;
             }
         }
         return (int)ans;
    }
}