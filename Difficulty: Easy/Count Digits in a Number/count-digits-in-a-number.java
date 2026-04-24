class Solution {
    public static int countDigits(int n) {
        // Code here
        int c=0;
        while(n!=0){
            int rem=n%10;
            c++;
            n=n/10;
        }
        return c;
    }
}
