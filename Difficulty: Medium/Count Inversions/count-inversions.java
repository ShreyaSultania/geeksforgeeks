class Solution {
    static int merge(int low,int mid,int high,int[]arr){
        ArrayList<Integer>temp=new ArrayList<>();
        // if(low>=high) return 0;
        int i=low;
        int j=mid+1;
        int c=0;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else{
                temp.add(arr[j]);
                c+=(mid-i+1);
                j++;
            }
        }
        while(i<=mid){
             temp.add(arr[i]);
                i++;
        }
        while(j<=high){
            temp.add(arr[j]);
                j++;
        }
        for(int k=low;k<=high;k++){
            arr[k]=temp.get(k-low);
        }
        return c;
        
    }
    static int divide(int low,int high,int []arr){
        int c=0;
        if(low>=high) return c;
        int mid=(low+high)/2;
        c+=divide(low,mid,arr);
        c+=divide(mid+1,high,arr);
        c+=merge(low,mid,high,arr);
        return c;
    }
    static int inversionCount(int arr[]) {
        // Code Here
            // BRUTE FORCE
        int n=arr.length;
        // int c=0;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(arr[i]>arr[j]) c++;
        //     }
        // }
        // return c;
        
        // OPTIMAL SOLUTION
        return divide(0,n-1,arr);
    }
}