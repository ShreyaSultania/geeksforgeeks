class myStack {
 int []arr;
 int idx;
    public myStack(int n) {
        // Define Data Structures
        arr=new int[n];
        idx=-1;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        if(idx==-1) return true;
        return false;
    }

    public boolean isFull() {
        // check if the stack is full
        if(idx==arr.length-1) return true;
        return false;
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        if(idx==arr.length-1) return;
        idx++;
        arr[idx]=x;
    }

    public void pop() {
        if(idx==-1) return;
        // Removes an element from the top of the stack
        idx--;
    }

    public int peek() {
        // Returns the top element of the stack
        if(idx==-1) return -1;
        return arr[idx];
    }
}