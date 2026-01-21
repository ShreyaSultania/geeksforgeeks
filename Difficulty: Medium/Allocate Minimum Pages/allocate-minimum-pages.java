class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        if(arr.length<k) return -1;
        int total=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
            if(max<arr[i]) max=arr[i];
        }
        int low=max;
        int high=total;
        while(low<=high){
            int mid=(low+high)/2;
            int s=1;
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
                if(sum>mid) {
                    s++;
                    sum=arr[i];
                }
            }
            if(s<=k) high=mid-1;
            else low=mid+1;
        }
        return low;
    }

    
}