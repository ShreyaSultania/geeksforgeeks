class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(st.size()==0 || st.peek()<=arr[i]){
                st.push(arr[i]);
            }
        }
        while(st.size()>0){
            ans.add(st.peek());
            st.pop();
        }
        return ans;
    }
}
