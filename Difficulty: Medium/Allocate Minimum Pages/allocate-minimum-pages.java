class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        if(k>arr.length) return -1;
        int min=Integer.MIN_VALUE;
        int total=0;
        for(int i=0;i<arr.length;i++){
            min=Math.max(min,arr[i]);
            total+=arr[i];
        }
        int low=min;
        int high=total;
        while(low<high){
            int s=1;
            int sum=arr[0];
            int mid=(low+high)/2;
            for(int i=1;i<arr.length;i++){
                sum+=arr[i];
                if(sum>mid){
                    s++;
                    sum=arr[i];
                }
            }
            if(s>k) low=mid+1;
            else high=mid;
        }
        return low;
    }
}