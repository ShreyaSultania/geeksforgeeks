class Solution {
    int firstOccurence(int []arr,int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]>target) high=mid-1;
            else low=mid+1;
        }
        return ans;
    }
     int lastOccurence(int []arr,int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid]>target) high=mid-1;
            else low=mid+1;
        }
        return ans;
    }
    int countFreq(int[] arr, int target) {
        // code here
        int first=firstOccurence(arr,target);
        int last=lastOccurence(arr,target);
        if(first==-1 || last==-1) return 0;
        return last-first+1;
    }
}
