class Solution {
    // Function to calculate factorial of a number.
    int product=1;
    int factorial(int n) {
        // code here
        if(n==0) return 1;
        product*=n;
        factorial(n-1);
        return product;
    }
}
