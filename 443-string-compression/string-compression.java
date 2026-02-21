class Solution {
    public int compress(char[] chars) {
        String s = "";
        int cnt=1,i=0;
        for(i=1;i<chars.length;i++){
            if(chars[i-1]!=chars[i]){
                s=s+chars[i-1];
                if(cnt>1){s=s+String.valueOf(cnt);}
                cnt=1;
            }
            else{
                cnt++;
            }
        }
        s=s+chars[i-1];
       if(cnt>1){s=s+String.valueOf(cnt);}
       for(i=0;i<s.length();i++){
        chars[i]=s.charAt(i);
       }
        return s.length();
    }
}