class Solution {
// Much simpler version most people understand
public int leastInterval(char[] tasks, int n) {
    int[] freq = new int[26];
    for (char c : tasks) freq[c-'A']++;
    
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
    for (int f : freq) if (f > 0) pq.offer(f);
    
    int time = 0;
    while (!pq.isEmpty()) {
        List<Integer> used = new ArrayList<>();
        // Take up to n+1 different tasks
        for (int i = 0; i <= n; i++) {
            if (!pq.isEmpty()) {
                int count = pq.poll();
                if (count > 1) used.add(count - 1);
                time++;
            } else if (!pq.isEmpty() || !used.isEmpty()) {
                // Idle only if tasks remain
                time++;
            }
        }
        for (int c : used) pq.offer(c);
    }
    return time;
}
}
