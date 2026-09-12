class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n=arr.length;
        int []res=new int[n];
        int pre[]=new int[n];
        int suff[]=new int[n];
        pre[0]=1;
        suff[n-1]=1;
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]*arr[i-1];
        }
        for(int i=n-2;i>=0;i--){
            suff[i]=suff[i+1]*arr[i+1];
        }
        for(int i=0;i<n;i++){
            res[i]=pre[i]*suff[i];
        }
        return res;
    }
}
