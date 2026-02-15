class Solution {
    public static int gcd(int a, int b) {
        // code here
        if(b%a==0) return a;
        return gcd(b%a,a);
    }
}
