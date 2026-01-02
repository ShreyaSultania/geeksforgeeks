class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        int n=prices.length;
        Arrays.sort(prices);
       int minPrice=0;
       int maxPrice=0;
       int buy=0;
       int free=n-1;
       while(buy<=free){
           minPrice+=prices[buy];
           buy++;
           free=free-k;
       }
        buy=n-1;
        free=0;
       while(buy>=free){
           maxPrice+=prices[buy];
           buy--;
           free=free+k;
       }
        ans.add(minPrice);
        ans.add(maxPrice);
        return ans;
    }
}
