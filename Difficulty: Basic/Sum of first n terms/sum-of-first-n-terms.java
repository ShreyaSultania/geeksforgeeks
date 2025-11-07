// User function Template for Java

class Solution {
    int sum=0;
    int sumOfSeries(int n) {
        // code here
          if(n==0) return 0;
        sum+=n*n*n;
       sumOfSeries(n-1);
       return sum;
    }
}