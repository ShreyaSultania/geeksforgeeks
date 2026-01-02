class Solution {
   class Pair implements Comparable<Pair>{
       int start;
       int end;
       Pair(int start,int end){
           this.start=start;
           this.end=end;
       }
       public int compareTo(Pair p){
           return this.end-p.end;
       }
       
   }
    public int maxMeetings(int start[], int end[]) {
        // add your code here\
        int count=1;
        int n=start.length;
        ArrayList<Pair>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new Pair(start[i],end[i]));
        }
        Collections.sort(arr);
        int lastend=arr.get(0).end;
        for(int i=1;i<arr.size();i++){
            Pair p=arr.get(i);
            int s=p.start;
            int e=p.end;
            if(s>lastend){
                count++;
                lastend=e;
            }
        }
        return count;
    }
}
