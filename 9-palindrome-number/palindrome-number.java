class Solution {
    public boolean isPalindrome(int x) {
        int n=x,sum=0;
        while(n>0){
            int rem = n%10;
            sum=(sum*10)+rem;
            System.out.println(rem);
            n=n/10;
        }
        System.out.println(sum);
        return (sum == x)? true:false;
        
    }
}