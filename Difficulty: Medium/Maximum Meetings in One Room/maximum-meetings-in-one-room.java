class Solution {
   static class Triplet implements Comparable<Triplet>{
        int start;
        int end;
        int idx;
        Triplet(int start,int end,int idx){
            this.start=start;
            this.end=end;
            this.idx=idx;
            
        }
      public int compareTo(Triplet p){
            return this.end-p.end;
        }
    }
    public static ArrayList<Integer> maxMeetings(int n, int[] S, int[] F) {
        // code here
        ArrayList<Triplet>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(new Triplet(S[i],F[i],i+1));
        }
        Collections.sort(ans);
        int last=ans.get(0).end;
        ArrayList<Integer>meeting=new ArrayList<>();
        meeting.add(ans.get(0).idx);
        for(int i=0;i<n;i++){
            Triplet p=ans.get(i);
            int s=p.start;
            int e=p.end;
            int index=p.idx;
            if(s>last){
                meeting.add(index);
                last=e;
            }
        }
        Collections.sort(meeting);
        return meeting;
    }
}
