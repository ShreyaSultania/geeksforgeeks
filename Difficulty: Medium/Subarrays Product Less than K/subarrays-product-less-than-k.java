class Solution {
    public int countSubarray(int[] arr, int k) {
        // code here
        int n=arr.length;
        int i=0;
        int j=0;
        int p=1;
        int c=0;
        while(j<n){
            p=p*arr[j];
            while(p>=k && i<=j){
                p=p/arr[i];
                i++;
            }
            c+=(j-i+1);
            j++;
        }
        return c;
    }
}