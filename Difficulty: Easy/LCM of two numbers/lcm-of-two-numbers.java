class Solution {
    int gcd(int a,int b){
        if(a==0) return b;
        if(b==0) return a;
        return gcd(b%a,a);
    }
    public int lcm(int a, int b) {
        // code here
        return (a*b)/gcd(a,b);
    }
}