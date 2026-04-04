class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0;
       // System.out.println(nums1.length+" "+nums2.length);
        //if(nums1.length <=0 &&nums2.length<=0){return 0;}
        int[] res= new int[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                res[k++]=nums1[i++];
            }else{
                res[k++]=nums2[j++];
            }
        }
        for(int l=i;l<nums1.length;l++){ res[k++]= nums1[l];}
        for(int l=j;l<nums2.length;l++){res[k++]= nums2[l];}
        int mid = res.length/2;
        if(res.length%2 == 1){
            return res[(res.length-1)/2];
        }else{
                return ((res[mid]+res[mid-1])/2.0);
            }
    }
}