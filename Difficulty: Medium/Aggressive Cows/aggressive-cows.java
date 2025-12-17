class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<stalls.length;i++){
            if(max<stalls[i]) max=stalls[i];
            if(min>stalls[i]) min=stalls[i];
        }
        int low=0;
        int high=max-min;
        Arrays.sort(stalls);
        while(low<=high){
            int cows=1;
            int mid=(low+high)/2;
            int lastPos=stalls[0];
            for(int i=1;i<stalls.length;i++){
            if(lastPos+mid<=stalls[i]){
                cows++;
                lastPos=stalls[i];
            }
            }
            if(cows<k) high=mid-1;
            else low=mid+1;
        }
        return high;
    }
}