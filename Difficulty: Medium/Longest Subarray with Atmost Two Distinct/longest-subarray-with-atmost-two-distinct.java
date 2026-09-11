class Solution {
    public int totalElements(int[] arr) {
        // code here
        int n=arr.length;
        int i=0;
        int j=0;
        int max=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(j<n){
            if(!map.containsKey(arr[j])){
                map.put(arr[j],1);
            }
            else{
                int freq=map.get(arr[j]);
                map.put(arr[j],freq+1);
            }
            while(map.size()>2){
                int freq=map.get(arr[i]);
                if(freq==1){
                    map.remove(arr[i]);
                }
                else{
                    map.put(arr[i],freq-1);
                }
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}