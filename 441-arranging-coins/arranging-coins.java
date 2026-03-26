class Solution {
    public int arrangeCoins(int n) {
        if(n==1) return 1;
        int i=1,s=0;
        long sum=0;
        for(i=1;i<n;i++){
            sum+=i;
            if(sum >n) break;
            else if(sum==n){
                s=1;
                break;
            }
        }
        return (s==1) ? i:i-1;
    }
}