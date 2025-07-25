class Solution {
    public ArrayList<Integer> nextLargerElement(int[] nums) {
        // code here
        Stack<Integer>st=new Stack<>();
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            if(st.isEmpty()){
                ans.add(-1);
                st.push(nums[i]);
            }
            else if(nums[i]<st.peek()){
                ans.add(st.peek());
                st.push(nums[i]);
            }
            else{
                while(st.size()>0 && nums[i]>=st.peek()){
                    st.pop();
                }
                if(st.isEmpty()){ 
                    ans.add(-1);
                    st.push(nums[i]);
                }
                else{
                ans.add(st.peek());
                st.push(nums[i]);
                }
            }
            }
        
         Collections.reverse(ans);
         return ans;
}
}