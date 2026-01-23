class Solution {
    static ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        ArrayList<Integer>pge=new ArrayList<>();
        for(int i=0;i<n;i++){
            pge.add(0);
        }
        pge.set(0,-1);
        st.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            while(!st.isEmpty() && st.peek()<=arr[i]) st.pop();
            if(st.isEmpty()) pge.set(i,-1);
            else if(st.peek()>arr[i]) {
                pge.set(i,st.peek());
            }
            st.push(arr[i]);
        }
        return pge;
    }
}