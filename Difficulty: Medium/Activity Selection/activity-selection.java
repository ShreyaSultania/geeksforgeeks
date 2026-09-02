class Pair implements Comparable<Pair>{
    int start;
    int finish;
    Pair(int start,int finish){
        this.start=start;
        this.finish=finish;
    }
    public int compareTo(Pair p){
        return this.finish-p.finish;
    }
}
class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        
        ArrayList<Pair>arr=new ArrayList<>();
        for(int i=0;i<start.length;i++){
            arr.add(new Pair(start[i],finish[i]));
        }
        Collections.sort(arr);
         Pair pt=arr.get(0);
            int intial_St=pt.start;
            int initial_Ft=pt.finish;
            int c=1;
        for(int i=1;i<arr.size();i++){
            Pair p=arr.get(i);
            if(p.start>initial_Ft){
                c++;
                initial_Ft=p.finish;
            }
        }
        return c;
    }
    
}
