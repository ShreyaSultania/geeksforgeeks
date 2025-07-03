// User function Template for Java//User function Template for Java
class Solution {
    void fun(int arr[],int index,int sum,ArrayList<Integer>res){
        if(index==arr.length){
            res.add(sum);
            return;
        }
        // include the element.
        fun(arr,index+1,sum+arr[index],res);
        // exclude the element
        fun(arr,index+1,sum,res);
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        fun(arr,0,0,res);
        Collections.sort(res);
        return res;
    }
}