class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        StringBuilder sb = new StringBuilder(s1);
        sb.setCharAt(1,s1.charAt(3));
        sb.setCharAt(3,s1.charAt(1));
        if(s2.equals(sb.toString())) return true;
        sb.setCharAt(1,s1.charAt(1));
        sb.setCharAt(3,s1.charAt(3));
        sb.setCharAt(0,s1.charAt(2));
        sb.setCharAt(2,s1.charAt(0));
        if(s2.equals(sb.toString())) return true;
        sb.setCharAt(1,s1.charAt(3));
        sb.setCharAt(3,s1.charAt(1));
        sb.setCharAt(0,s1.charAt(2));
        sb.setCharAt(2,s1.charAt(0));
        return s2.equals(sb.toString());
    }
}