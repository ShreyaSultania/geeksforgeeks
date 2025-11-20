class Solution {
    int maxLength(int arr[]) {
        // code here
        int n=arr.length;
        int len=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                len=Math.max(len,i+1);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            else{
                len=Math.max(len,i-map.get(sum));
            }
        }
        return len;
    }
}