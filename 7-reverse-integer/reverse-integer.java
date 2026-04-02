class Solution {
    public int reverse(int x) {
        int sign=1,rem=0;
        long res=0;
        if(x<0){sign=-1;}
        while(x!=0){
            rem=x%10;
            res=res*10+rem;
            x=x/10;
        }
        if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE){return 0;}
        else{
            return (int)res;
        }
 
    }
}