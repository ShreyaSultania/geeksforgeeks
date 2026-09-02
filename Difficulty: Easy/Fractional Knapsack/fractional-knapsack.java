class Triplet implements Comparable<Triplet>{
    int value;
    int weight;
    double wPv;
    Triplet( int value,int weight,double wPv){
        this.value=value;
        this.weight=weight;
        this.wPv=wPv;
    }
    public int compareTo(Triplet t){
        return Double.compare(t.wPv,this.wPv);
    }
}
class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        ArrayList<Triplet>arr=new ArrayList<>();
        for(int i=0;i<val.length;i++){
            arr.add(new Triplet(val[i],wt[i],(double)val[i]/wt[i]));
        }
        double total=0;
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
            Triplet p=arr.get(i);
            int v=p.value;
            int w=p.weight;
            double wPv=p.wPv;
            if(capacity>w){
                total+=v;
                capacity=capacity-w;
            }
            else if(capacity>0){
                total+=(capacity*wPv);
                break;
            }
        }
        return total;
    }
}