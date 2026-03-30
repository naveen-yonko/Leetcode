class Solution {
    public boolean checkStrings(String s1, String s2) {
        char[] oddpos = new char[26];
        char[] evenpos = new char[26];
        for(int i=0;i<s1.length();i=i+2){evenpos[s1.charAt(i)-'a']++;}
        for(int i=1;i<s1.length();i=i+2){oddpos[s1.charAt(i)-'a']++;}
        for(int i=0;i<s2.length();i=i+2){evenpos[s2.charAt(i)-'a']--;}
        for(int i=1;i<s2.length();i=i+2){oddpos[s2.charAt(i)-'a']--;}
        for(int i=0;i<26;i++){
            if(evenpos[i]!=0 || oddpos[i]!=0){return false;}
        }
        return true;
    }
}