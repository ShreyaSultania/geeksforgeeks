class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])) map.put(arr[i],1);
            else{
                int freq=map.get(arr[i]);
                map.put(arr[i],freq+1);
            }
        }
        for(int i=1;i<=arr.length;i++){
            if(!map.containsKey(i)) ans.add(0);
            else{
            int f=map.get(i);
            ans.add(f);
                
            }
        }
        return ans;
    }
}
