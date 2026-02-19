class Solution {
    public int subtractProductAndSum(int n) {
        int rem = 0,pro=1,sum=0;
        while(n>0){
            rem = n%10;
            pro = pro*rem;
            sum = sum+rem;
            n=n/10;
        }
        return pro-sum;
    }
}