class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int winsum = 0, tot = 0;
        for (int i = 1; i <= arr.length; i = i + 2) {
            winsum = 0;
            for (int j = 0; j < i; j++) {
                winsum += arr[j];
            }
            tot += winsum;
            //System.out.println(" AFTER WIN OF SIZE "+i+" TOT="+tot+"WINSUM="+winsum);
            for (int j = i; j < arr.length; j++) {
                winsum += arr[j] - arr[j - i];
                tot += winsum;
                //System.out.print("INSIDE LOOP :TOT="+tot+"WINSUM="+winsum+"\t");
            }
            //System.out.println("TOT="+tot+"WINSUM="+winsum);
        }
        return tot;
    }
}