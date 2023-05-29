package LV2;

import java.util.PriorityQueue;

public class H42626 {
    public int solution(int[] scoville, int K) {
        // 횟수를 세기 위한 변수 초기화
        int answer = 0;

        // 우선순위 큐 (최소 힙) 초기화
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        // 모든 스코빌 지수를 힙에 삽입
        for (int aScoville : scoville) {
            heap.offer(aScoville);
        }

        // 힙의 최솟값이 K 미만인 동안 반복
        while (heap.peek() < K) {
            // 힙의 크기가 2 미만이면 K 이상으로 만들 수 없으므로 -1 반환
            if (heap.size() < 2) return -1;

            // 스코빌 지수가 가장 낮은 음식과 그 다음으로 낮은 음식을 가져옴
            int first = heap.poll();
            int second = heap.poll();

            // 새로운 음식의 스코빌 지수 계산
            int newScoville = first + (second * 2);

            // 새로운 음식을 힙에 삽입
            heap.offer(newScoville);

            // 섞은 횟수 증가
            answer++;
        }

        // 모든 음식의 스코빌 지수를 K 이상으로 만드는데 필요한 최소 섞기 횟수 반환
        return answer;
    }
}