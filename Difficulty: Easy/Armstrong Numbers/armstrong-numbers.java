// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int sum=0;
        int temp=n;
        while(temp!=0){
            int rem=temp%10;
            sum+=(rem*rem*rem);
            temp=temp/10;
        }
        return sum==n;
    }
}