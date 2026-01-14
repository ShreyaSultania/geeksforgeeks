class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        int res=(n>>k)&1;
        if(res!=0) return true;
        return false;
    }
}