class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] sarr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        //for(String iq :sarr){System.out.print(iq+"|");}
        for (int i = sarr.length - 1; i >= 0; i--) {
            if (sarr[i].isEmpty()) {
                continue;
            }else{
            sb.append(sarr[i]);
            sb.append(" ");
            }
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

}