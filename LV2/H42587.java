package LV2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
운영체제의 역할 중 하나는 컴퓨터 시스템의 자원을 효율적으로 관리하는 것입니다.
이 문제에서는 운영체제가 다음 규칙에 따라 프로세스를 관리할 경우 특정 프로세스가 몇 번째로 실행되는지 알아내면 됩니다.

1. 실행 대기 큐(Queue)에서 대기중인 프로세스 하나를 꺼냅니다.
2. 큐에 대기중인 프로세스 중 우선순위가 더 높은 프로세스가 있다면 방금 꺼낸 프로세스를 다시 큐에 넣습니다.
3. 만약 그런 프로세스가 없다면 방금 꺼낸 프로세스를 실행합니다.
  3.1 한 번 실행한 프로세스는 다시 큐에 넣지 않고 그대로 종료됩니다.
예를 들어 프로세스 4개 [A, B, C, D]가 순서대로 실행 대기 큐에 들어있고, 우선순위가 [2, 1, 3, 2]라면 [C, D, A, B] 순으로 실행하게 됩니다.

현재 실행 대기 큐(Queue)에 있는 프로세스의 중요도가 순서대로 담긴 배열 priorities와,
몇 번째로 실행되는지 알고싶은 프로세스의 위치를 알려주는 location이 매개변수로 주어질 때,
해당 프로세스가 몇 번째로 실행되는지 return 하도록 solution 함수를 작성해주세요.
 */
public class H42587 {
	public int solution(int[] priorities, int location) {
		// 프로세스를 순서대로 관리하는 큐를 선언
		Queue<Integer> q = new LinkedList<>();
		// 프로세스를 우선순위대로 관리하는 우선순위 큐를 선언
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		// 프로세스의 우선순위를 큐와 우선순위 큐에 추가
		for (int i : priorities) {
			q.offer(i);
			pq.offer(i);
		}

		// 실행된 프로세스의 개수를 카운트할 변수 선언
		int answer = 0;
		// 큐가 빌 때까지 실행
		while (!q.isEmpty()) {
			// 큐에서 프로세스를 하나 꺼내기
			int current = q.poll();
			// 꺼낸 프로세스의 우선순위가 가장 높다면
			if (current == pq.peek()) {
				// 실행된 프로세스 개수를 하나 증가시키고
				answer++;
				// 우선순위 큐에서 해당 프로세스를 제거한다.
				pq.poll();
				// 꺼낸 프로세스가 찾고자 하는 프로세스라면 반복문을 종료
				if (location == 0) {
					break;
					// 아니라면 찾고자 하는 프로세스의 위치를 하나 줄인다.
				} else {
					location--;
				}
				// 꺼낸 프로세스의 우선순위가 가장 높지 않다면
			} else {
				// 큐의 마지막에 다시 넣는다.
				q.offer(current);
				// 찾고자 하는 프로세스의 위치를 조정한다.
				location = (location == 0) ? q.size() - 1 : location - 1;
			}
		}
		// 찾고자 하는 프로세스가 실행된 순서를 반환
		return answer;
	}
}