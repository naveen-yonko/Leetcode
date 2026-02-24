class Solution {
    public boolean isValid(String s) {
        Stack stk = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stk.push(s.charAt(i));
            } else if (stk.empty()) {
                return false;
            } else if (s.charAt(i) == ')') {
                if ((char) stk.pop() != '(') {
                    return false;
                }
            } else if (s.charAt(i) == ']') {
                if ((char) stk.pop() != '[') {
                    return false;
                }
            } else if (s.charAt(i) == '}') {
                if ((char) stk.pop() != '{') {
                    return false;
                }
            }
        }
        return stk.empty();
    }
}