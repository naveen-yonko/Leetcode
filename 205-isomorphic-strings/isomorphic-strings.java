class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm = new HashMap<>();
        HashMap<Character, Character> hm1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), t.charAt(i));
            } else {
                if (hm.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
            if (!hm1.containsKey(t.charAt(i))) {
                hm1.put(t.charAt(i), s.charAt(i));
            } else {
                if (hm1.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            }
        }
        //System.out.println(hm);
        //System.out.println(hm1);

        return true;
    }
}