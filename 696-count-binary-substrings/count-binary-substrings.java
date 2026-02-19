class Solution {
    public int countBinarySubstrings(String s) {
        int i=0,j=0,cnt=0;
        List<Integer> ls = new ArrayList<>();
        while(i<s.length() && j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                cnt++;
                j++;
            }else{
                ls.add(cnt);
                i=j;
                cnt=0;
            }
        }
        ls.add(cnt);
        int sum=0;
        for(int k=0;k<ls.size()-1;k++){
            sum+=Math.min(ls.get(k),ls.get(k+1));
        }
        return sum;
    }
}