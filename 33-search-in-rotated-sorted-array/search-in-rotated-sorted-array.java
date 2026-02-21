class Solution {
    public int search(int[] nums, int target) {
        int l=0,h=nums.length-1;
        while(l<h){
            int mid = l+(h-l)/2;
            if(nums[mid]>nums[h]){
                l=mid+1;
            }else{
                h=mid;
            }
        }
        l=0;
        int l2= h;
        h= (h+nums.length-1)%nums.length;//Math.max(h-1,0);
        System.out.println(nums[h]);
        while(l<=h){
            int mid = l+(h-l)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                h = mid-1;
            }
        }
        h=nums.length-1;
        //System.out.println(nums[l2]+" "+nums[h]);
        while(l2<=h){
            int mid = l2+(h-l2)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]<target){
                l2=mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return -1;
    }
}