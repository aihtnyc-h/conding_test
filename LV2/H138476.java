package LV2;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class H138476 {
    public int solution(int k, int[] tangerines) {
        // HashMap을 사용하여 각 귤의 크기와 그 개수를 저장
        Map<Integer, Integer> map = new HashMap<>();
        for (int tangerine : tangerines) {
            map.put(tangerine, map.getOrDefault(tangerine, 0) + 1);
        }

        // 우선순위 큐를 사용하여 빈도수가 많은 귤의 크기를 우선적으로 꺼낼 수 있도록 한다.
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);
        for (int key : map.keySet()) {
            queue.add(new int[]{key, map.get(key)});
        }

        // count는 서로 다른 크기의 귤의 종류 수를 나타낸다.
        int count = 0;
        while (k > 0) {
            // 우선순위 큐에서 가장 빈도수가 높은 귤의 크기를 꺼낸다.
            int[] curr = queue.poll();
            if (curr[1] <= k) {
                // 현재 꺼낸 귤의 크기의 개수가 k보다 작거나 같다면, 모두 선택할 수 있으므로
                // k에서 그 개수를 빼주고, 선택한 귤의 크기의 종류 수를 1 늘린다.
                k -= curr[1];
                count++;
            } else {
                // 현재 꺼낸 귤의 크기의 개수가 k보다 크다면, 남은 귤을 모두 같은 크기로 선택할 수 있으므로
                // 현재까지 선택한 귤의 크기의 종류 수에 1을 더해서 반환한다.
                return count + 1;
            }
        }

        // k개의 귤을 모두 선택했다면, 현재까지 선택한 귤의 크기의 종류 수를 그대로 반환
        return count;
    }
}