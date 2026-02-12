class Solution {
    public boolean hasAlternatingBits(int n) {
        if(n<3){return true;}
        int prev = n%2;
        n=n/2;
        while(n>0){
            int rem = n%2;
            n=n/2;
            if(rem == prev){return false;}
            prev = rem;
        }
        return true ;
    }
}