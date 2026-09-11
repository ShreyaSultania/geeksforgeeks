class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int i=0;
        int j=i+1;
        int n=arr.length;
        while(j<n){
            if(arr[i]!=0){
                i++;
            }
            else if(arr[i]==0 && arr[j]!=0){
                // swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            j++;
        }
    }
}