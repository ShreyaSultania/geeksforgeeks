class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int n=arr.length;
        int idx=-1;
        int []pre=new int[n];
        int total=arr[0];
        pre[0]=arr[0];
        for(int i=1;i<n;i++){
            pre[i]=arr[i]+pre[i-1];
            total+=arr[i];
        }
        
        for(int i=0;i<n;i++){
            int right=total-pre[i];
            int left=total-right-arr[i];
            if(left==right){
                return i;
            }
        }
        return -1;
    }
}
