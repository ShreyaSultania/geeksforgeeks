class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int n=arr.length;
        int i=0;
        int j=n-1;
        int max=0;
        while(i<j){
            int h=Math.min(arr[i],arr[j]);
            int w=j-i;
            int a=h*w;
            max=Math.max(max,a);
            if(arr[i]<arr[j]) i++;
            else j--;
        }
        return max;
    }
}