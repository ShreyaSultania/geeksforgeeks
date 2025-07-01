class Solution {
    public void reverse(int arr[],int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
       
    
    public void sortInWave(int arr[]) {
        // code here
        int n=arr.length;
       for(int i=0;i<n-1;i=i+2){
        //   if(arr[i]<arr[i+1])
           reverse(arr,i,i+1);
       }
        
    }
}
