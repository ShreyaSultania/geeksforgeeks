class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n=arr.length;
        int left[]=new int[n];
        left[0]=arr[0];
        int []right=new int[n];
        right[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
            int ele=Math.max(arr[i],left[i-1]);
            left[i]=ele;
        }
        for(int i=n-2;i>=0;i--){
            int ele=Math.max(arr[i],right[i+1]);
            right[i]=ele;
        }
        int total=0;
        for(int i=0;i<n;i++){
            total+=((Math.min(left[i],right[i]))-arr[i]);
        }
        return total;
    }
}
