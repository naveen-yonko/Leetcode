class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        List<Integer> ls= new ArrayList<>();
        for(int n:nums){
            if(!hm.containsKey(n)){hm.put(n,1);}
            else{hm.put(n,hm.get(n)+1);}
        }
        for(Map.Entry<Integer,Integer> e : hm.entrySet()){
            if(e.getValue() > nums.length/3){
                ls.add(e.getKey());
            }
        }
        return ls;
    }
}