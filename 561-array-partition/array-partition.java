class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        for(int i=0;i<=nums.length-2;i=i+2){
            //System.out.println(i+" "+(i+1)+" "+nums[i]+" "+nums[i+1]);
            res+=Math.min(nums[i],nums[i+1]);
        }
        return res;
    }
}