class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        int size = s.length();
        for(int i=1;i<size;i=i+2){
            
            int c = (int) s.charAt(i-1);
            int n = s.charAt(i)-'0';
            sb.append(s.charAt(i-1));
            sb.append((char)(c+n));
            //System.out.println(i+" "+c+" "+n+" "+(char)(c+n));
        }
        if(size%2 !=0){
            sb.append(s.charAt(size-1));
        }
        return sb.toString();
    }
}