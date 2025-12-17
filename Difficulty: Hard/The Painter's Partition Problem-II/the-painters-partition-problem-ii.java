class Solution {
    public int minTime(int[] arr, int k) {
        // code here
        int total=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
            if(arr[i]>max) max=arr[i];
        }
        int low=max;
        int high=total;
        while(low<=high){
            int mid=(low+high)/2;
            int sum=0;
            int painters=1;
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
                if(sum>mid){
                    painters++;
                    sum=arr[i];
                }
            }
            if(painters<=k) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}
