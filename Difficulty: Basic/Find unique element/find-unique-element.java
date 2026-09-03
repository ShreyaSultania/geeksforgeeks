class Solution {
    public int uniqueElement(int[] nums, int k) {
        // code here
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                int freq=map.get(nums[i]);
                map.put(nums[i],freq+1);
            }
        }
        for(int key:map.keySet()){
            int freq=map.get(key);
            if(freq%k!=0){
                return key;
            }
        }
        return -1;
    }
}