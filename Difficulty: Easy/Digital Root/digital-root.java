class Solution {
    int len(int d){
        int c=0;
        while(d!=0){
            c++;
            d=d/10;
        }
        return c;
    }
    public int digitalRoot(int n) {
        // code here
        int temp=n;
        while(len(temp)>1){
            int sum=0;
            while(temp!=0){
                int rem=temp%10;
                sum+=rem;
                temp=temp/10;
            }
            temp=sum;
        }
        return temp;
    }
};