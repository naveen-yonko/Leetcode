class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> res = new ArrayList<>();
        List li = new ArrayList<>();
        TreeMap<Integer, Integer> hm = new TreeMap<>();
        for (int i = 0; i < items1.length; i++) {
            hm.put(items1[i][0], items1[i][1]);
        }
        for (int i = 0; i < items2.length; i++) {
            if (hm.containsKey(items2[i][0])) {
                hm.put(items2[i][0], hm.get(items2[i][0]) + items2[i][1]);
            } else {
                hm.put(items2[i][0], items2[i][1]);
            }
        }
        for (Map.Entry<Integer, Integer> m : hm.entrySet()) {
            li.add(m.getKey());
            li.add(m.getValue());
            res.add(new ArrayList<>(li));
            li.clear();
        }
        return res;
    }
}