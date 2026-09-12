class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int n=arr.length;
        int c=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                c+=map.get(sum-k);
            }
            if(!map.containsKey(sum)){
                map.put(sum,1);
            }
            else{
                int freq=map.get(sum);
                map.put(sum,freq+1);
            }
        }
        return c;
    }
}