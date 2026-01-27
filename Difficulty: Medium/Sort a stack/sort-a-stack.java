class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        Stack<Integer>temp=new Stack<>();
        Stack<Integer>temp1=new Stack<>();
        while(st.size()>0){
            while(temp.size()>0 && st.peek()>temp.peek()){
                temp1.push(temp.peek());
                temp.pop();
            }
                temp.push(st.peek());
                st.pop();
                while(temp1.size()>0){
                    temp.push(temp1.peek());
                    temp1.pop();
                }
        }
        while(temp.size()>0){
            st.push(temp.peek());
            temp.pop();
        }
        
    }
}