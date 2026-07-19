class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>(
            (a, b) -> {
                if (map.get(a).equals(map.get(b))) {
                    return b.compareTo(a); // reverse alphabetical for min-heap
                }
                return map.get(a) - map.get(b); // smaller frequency first
            }
        );
        for (String word:map.keySet()) {
            pq.offer(word);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        LinkedList<String> ans = new LinkedList<>();
        while (!pq.isEmpty()) {
            ans.addFirst(pq.poll());
        }
        return ans;
    }
}