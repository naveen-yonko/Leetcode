class Solution {
    public boolean stoneGame(int[] piles) {
        Arrays.sort(piles);
        int asum=0,bsum=0;
        for(int i=piles.length-1;i>0;i=i-2){
            asum+=piles[i];
            bsum+=piles[i-1];
        }
        //System.out.println(asum+" "+bsum);
        return asum>bsum;
    }
    
}