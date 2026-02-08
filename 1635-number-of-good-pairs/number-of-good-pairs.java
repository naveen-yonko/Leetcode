class Solution {
    public int numIdenticalPairs(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                cnt+=(nums[i] == nums[j])?1:0;
            }
        }
        return cnt;
    }
}