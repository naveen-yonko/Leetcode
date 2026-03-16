class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){return false;}
        s=s+s;
        //System.out.println(s);
        return s.contains(goal);
    }
}