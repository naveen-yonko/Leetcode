class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,res = 0;
        HashSet<Character> hs = new HashSet<>();
        for(int j=0;j<s.length();j++){
            if(hs.add(s.charAt(j))){res = Math.max(res,hs.size());continue;}
            else{
                res = Math.max(res,hs.size());
                i++;
                j=i-1;
                hs.clear();
            }
        }
        return res;
    }
}