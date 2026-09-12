class Solution {
    int maxProduct(int[] arr) {
        // code here
        int p=1;
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            p=p*arr[i];
            max=Math.max(p,max);
            if(p==0){
                p=1;
            }
        }
        p=1;
        for(int i=n-1;i>=0;i--){
            p=p*arr[i];
            max=Math.max(p,max);
            if(p==0){
                p=1;
            }
        }
        return max;
    }
}