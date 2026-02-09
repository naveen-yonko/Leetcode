class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        if(n%2 !=0){
            for(int i=1;i<=n/2;i++){
                res[i]=i;
                res[n-i]= -i;
            }
        }else{
            for(int i=0;i<=(n/2)-1;i++){
                res[i]=i+1;
                res[n-1-i]= -(i+1);
            }
        }
        return res;
    }        
}
