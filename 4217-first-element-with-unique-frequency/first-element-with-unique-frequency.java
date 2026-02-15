class Solution {
    public int firstUniqueFreq(int[] nums) {
        LinkedHashMap <Integer,Integer> hm1 = new LinkedHashMap<>();
        LinkedHashMap <Integer,Integer> hm2 = new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hm1.containsKey(nums[i])){
                hm1.put(nums[i],1);
            }else{
                hm1.put(nums[i],hm1.get(nums[i])+1);
            }
        }
        for(Map.Entry<Integer,Integer> ent :hm1.entrySet()){
            if(!hm2.containsKey(ent.getValue())){
                hm2.put(ent.getValue(),1);
            }else{
                hm2.put(ent.getValue(),hm2.get(ent.getValue())+1);
            }
        }
        int val=-1;
        for(Map.Entry<Integer,Integer> ent :hm2.entrySet()){
            if(ent.getValue()==1){
                val = ent.getKey();
                break;
            }
        }
        for(Map.Entry<Integer,Integer> ent :hm1.entrySet()){
            if(ent.getValue()==val){
                return ent.getKey();
            }
        }
        return -1;
    }
}