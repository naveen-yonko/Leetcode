class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        res[0]=0;
        for(int i=1;i<=n;i++){
            String binary = Integer.toBinaryString(i);
            int cnt=0;
            for(int j=0;j<binary.length();j++){
                if(binary.charAt(j) == '1'){cnt++;}
            }
            res[i]=cnt;
        }
        return res;
    }
}