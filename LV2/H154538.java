package LV2;

import java.util.LinkedList;
import java.util.Queue;

public class H154538 {
    public int solution(int x, int y, int n) {
        // 연산 결과 범위를 1_000_001로 설정
        final int MAX = 1_000_001;

        // check 배열은 각 숫자에 도달하기 위한 최소 연산 횟수를 저장
        // 아직 도달하지 못한 숫자는 -1로 초기화하기
        int[] check = new int[MAX];
        for (int i = 0; i < MAX; i++) {
            check[i] = -1;
        }

        // 큐를 생성하고 시작 숫자 x를 넣는다.
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        // x에 대한 연산 횟수를 0으로 설정한다.
        check[x] = 0;

        // 큐가 비어있지 않은 동안 다음을 반복!
        while (!queue.isEmpty()) {
            // 큐에서 숫자를 꺼낸다.
            int current = queue.remove();

            // 꺼낸 숫자가 y와 같다면, 그 때의 연산 횟수를 반환한다.
            if (current == y) {
                return check[current];
            }

            // 꺼낸 숫자에 n을 더하거나, 2를 곱하거나, 3을 곱하여 다음 숫자를 계산한다.
            int[] next = {current + n, current * 2, current * 3};
            for (int i = 0; i < 3; i++) {
                // 다음 숫자가 범위 내에 있고 아직 방문하지 않았다면,
                if (next[i] > 0 && next[i] < MAX && check[next[i]] == -1) {
                    // 큐에 다음 숫자를 넣고 연산 횟수를 업데이트한다.
                    queue.add(next[i]);
                    check[next[i]] = check[current] + 1;
                }
            }
        }

        // 큐가 비어도 y에 도달하지 못했다면, y에 도달할 수 없다는 의미이므로 -1을 반환한다.
        return -1;
    }
}