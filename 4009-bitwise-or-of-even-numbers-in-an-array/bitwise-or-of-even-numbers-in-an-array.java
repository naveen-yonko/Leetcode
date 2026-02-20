class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int l=0,h=nums.length-1,or=0;
        while(l<=h){
            if(nums[l]%2 ==0){or=or|nums[l];}
            if(nums[h]%2 == 0){or=or|nums[h];}
            l++;h--;
        }
        return or;
    }
}