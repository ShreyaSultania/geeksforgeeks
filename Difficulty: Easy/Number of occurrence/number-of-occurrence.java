class Solution {
    int lowerBound(int []arr,int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    int upperBound(int []arr,int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
             int mid=(low+high)/2;
            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    int countFreq(int[] arr, int target) {
        // code here
        int low=lowerBound(arr,target);
        int high=upperBound(arr,target);
        if(low!=-1 && high!=-1) return high-low+1;
        else return 0;
    }
}
