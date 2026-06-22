class Solution {
    public static int gcd(int a, int b) {
        // code here
    // code here
    if(a==0 || b==0) return 0;
    if(a>b){
       while(a%b!=0 && b!=0){
           int c=a%b;
           a=b;
           b=c;
       }
       return b;
    }
    else{
        while(b%a!=0 && a!=0){
           int c=b%a;
           b=a;
           a=c;
       }
       return a;
    }
}
}
