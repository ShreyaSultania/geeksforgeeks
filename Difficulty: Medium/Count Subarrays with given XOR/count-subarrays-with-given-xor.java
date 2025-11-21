class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        int xor=0;
        int c=0;
        map.put(0,1);
        for(int i=0;i<n;i++){
            xor^=arr[i];
            if(map.containsKey(xor ^ k)){
                c+=map.get(xor^k);
            }
            if(!map.containsKey(xor)){
                map.put(xor,1);
            }
            else{
                int freq=map.get(xor);
                map.put(xor,freq+1);
            }
            
        }
        return c;
    }
}