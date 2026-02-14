class Solution {
    public int trap(int[] height) {
        if(height.length<3){return 0;}
        int lmax=height[0],rmax=height[height.length-1],l=1,r=height.length-2,res=0;
        // refer GFG for detailed explanation
        while(l<=r){
            //System.out.println("Loop In"+lmax+" "+rmax+" "+l+" "+" "+r+" "+res);
            if (lmax<rmax){
                res += Math.max(0,lmax-height[l]);
                lmax = Math.max(lmax,height[l]);
                l++; 
            }else{
                res +=Math.max(0,rmax-height[r]);
                rmax=Math.max(height[r],rmax);
                r--;
            }
           // System.out.println("Loop out"+lmax+" "+rmax+" "+l+" "+" "+r+" "+res);
        }
        return res;
        
    }
}