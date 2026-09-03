class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer>ans=new ArrayList<>();
        int i=0;
        int j=1;
        while(j<n){
            if(arr[i]!=arr[j]){
                arr[++i]=arr[j];
            }
            j++;
        }
        for(int k=0;k<=i;k++){
            ans.add(arr[k]);
        //   System.out.print(arr[k]);
        }
        return ans;
    }
}
