class Solution {
    public String reversePrefix(String word, char ch) {
        int i=0;
        StringBuilder sb = new StringBuilder();
        while(i<word.length() && word.charAt(i) != ch ){
            sb.append(word.charAt(i));
            i++;
        }
        if(i<word.length()){
        sb.append(word.charAt(i));
        sb.reverse();
        for(i = i+1;i<word.length();i++){
            sb.append(word.charAt(i));
        }
        }
        return sb.toString();
    }
}