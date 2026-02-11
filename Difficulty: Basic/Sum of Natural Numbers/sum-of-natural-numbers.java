class Solution {
    static int sum(int n,int s){
        if(n==0) return s;
        s+=n;
        return sum(n-1,s);
        // return s;
    }
    public static int findSum(int n) {
        // code here
       return sum(n,0);
    }
}
