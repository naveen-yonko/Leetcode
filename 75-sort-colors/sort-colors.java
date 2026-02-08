class Solution {
    public void sortColors(int[] nums) {
       mergesort(nums);
    }
    void mergesort(int[] ary){
        if(ary.length<=1) return;
        int mid= ary.length/2;
        int[] lft = new int[mid];
        int[] rgt = new int[ary.length-mid];
        int i=0,j=0;
        for(i=0;i<mid;i++){lft[i]=ary[i];} //cpy lft with left half
        for(;i<ary.length;i++){rgt[j++]=ary[i];} //cpy rgt with right half
        mergesort(lft);
        mergesort(rgt);
        merge(lft,rgt,ary);
    }
    void merge(int[]lft,int[] rgt,int[]ary){
        int lftsize=lft.length,rgtsize=rgt.length;
        int i=0,j=0,k=0;
        while(i<lftsize && j<rgtsize){
            if(lft[i]<rgt[j]){ary[k++]=lft[i++];}
            else{ary[k++]=rgt[j++];}
        }
        // remaining in any of the lft or rgt arrray
        while(i<lftsize){
            ary[k++]=lft[i++];
        }
        while(j<rgtsize){
            ary[k++]=rgt[j++];
        }
    }
}