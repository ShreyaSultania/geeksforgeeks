class Solution {
    public int findMin(int n) {
        int c=0;
        // code here
        while(n!=0){
            if((n/10)>0){
                c+=n/10;
                n=n%10;
            }
            else if((n/5)>0){
                c+=n/5;
                n=n%5;
            }
           else if((n/2)>0){
                c+=n/2;
                n=n%2;
            }
           else{
               c+=n;
               n=0;
           }
        }
        return c;
    }
}
