class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n=arr.length;
         ArrayList<Integer>ans=new ArrayList<>();
         HashMap<Integer,Integer>map=new HashMap<>();
         for(int i=0;i<arr.length;i++){
             if(!map.containsKey(arr[i])){
                 map.put(arr[i],1);
             }
             else{
                 int freq=map.get(arr[i]);
                 map.put(arr[i],freq+1);
             }
         }
         for(int ele:map.keySet()){
             int freq=map.get(ele);
             if(freq==2) ans.add(ele);
         }
         for(int i=1;i<=n;i++){
             if(!map.containsKey(i)) ans.add(i);
         }
         return ans;
    }
}
