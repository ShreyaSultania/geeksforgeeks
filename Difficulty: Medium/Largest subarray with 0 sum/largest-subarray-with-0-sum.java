class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int maxL=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum==0){
                maxL=Math.max(maxL,i+1);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            else{
                maxL=Math.max(maxL,i-map.get(sum));
            }
        }
        return maxL;
    }
}