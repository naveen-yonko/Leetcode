class Solution {
    public int maxProduct(int n) {
        int rem=0,smax=0,max=Integer.MIN_VALUE;
        while(n!=0){
            rem = n%10;
            if(rem>=max){
                smax = max;
                max=rem;
            }else if(rem >smax){
                smax=rem;
            }
            n=n/10;
        }

        return smax*max;
    }
}