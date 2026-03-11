class Solution {
    public int maxArea(int[] height) {
        int i = 0, l = 0, b = 0, max = 0, j = height.length-1;
        while (i < j) {
            l = Math.min(height[i], height[j]);
            b = j - i;
            if (l * b > max) {
                max = l * b;
            }
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;

    }
}