package LV1;

import java.util.PriorityQueue;

public class H138477 {
	public int[] solution(int k, int[] score) {
		PriorityQueue<Integer> queue = new PriorityQueue<>(); // 우선순위 큐를 선언합니다. 이 큐는 점수를 오름차순으로 정렬합니다.
		int[] answer = new int[score.length]; // 결과를 저장할 배열을 선언합니다. 배열의 크기는 점수의 개수와 동일합니다.

		for (int i = 0; i < score.length; i++) { // 모든 점수에 대해 반복합니다.
			if (queue.size() < k) { // 현재 큐의 크기가 k보다 작으면
				queue.add(score[i]); // 큐에 현재 점수를 추가합니다.
			} else if (score[i] > queue.peek()) { // 현재 큐의 크기가 k이고, 현재 점수가 큐의 루트보다 크면
				queue.poll(); // 큐의 루트를 제거합니다. 이렇게 하면 현재 큐의 크기가 k-1이 됩니다.
				queue.add(score[i]); // 큐에 현재 점수를 추가합니다. 이렇게 하면 현재 큐의 크기가 다시 k가 됩니다.
			}
			answer[i] = queue.peek(); // 큐의 루트는 현재 "명예의 전당"의 k번째 점수입니다. 이 점수를 결과 배열에 추가합니다.
		}

		return answer; // 결과 배열을 반환합니다.
	}
}