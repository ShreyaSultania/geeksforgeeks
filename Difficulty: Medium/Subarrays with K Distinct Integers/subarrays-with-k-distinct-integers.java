class Solution {
       // code here
       int helper(int[]arr,int k){
        int n=arr.length;
        int i=0;
        int j=0;
        int c=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(j<n){
            if(!map.containsKey(arr[j])){
                map.put(arr[j],1);
            }
            else{
                int freq=map.get(arr[j]);
                map.put(arr[j],freq+1);
            }
            while(map.size()>k){
                int freq=map.get(arr[i]);
                if(freq==1){
                    map.remove(arr[i]);
                }
                else{
                    map.put(arr[i],freq-1);
                }
                i++;
            }
            c+=j-i+1;
            j++;
        }
        return c;
       }
    public int exactlyK(int arr[], int k) {
      return helper(arr,k)-helper(arr,k-1);
    }
}
