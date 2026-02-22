class Solution {
    public int binaryGap(int n) {
        if (n < 3) {
            return 0;
        } else {
            String bin = Integer.toBinaryString(n);
            int i = 0, j = 0, max = 0;
            for (j = 1; j < bin.length(); j++) {
                if (bin.charAt(j) == '1') {
                    max = Math.max(max, (j - i));
                    i = j;
                }
            }
            return max;
        }
    }
}