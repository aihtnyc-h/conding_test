package LV2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.

또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고,
이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.

먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와
각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.


 */
public class H42586 {
	public int[] solution(int[] progresses, int[] speeds) {
		Queue<Integer> q = new LinkedList<>(); // 각 작업의 완료 날짜를 저장할 큐
		List<Integer> answerList = new ArrayList<>(); // 배포마다 몇 개의 기능이 배포되는지를 저장할 리스트

		for (int i = 0; i < speeds.length; i++) {
			double remain = (100 - progresses[i]) / (double) speeds[i]; // 각 작업마다 남은 일수 계산
			int date = (int) Math.ceil(remain); // 올림하여 날짜 계산 (일수는 소수점 없이 정수여야 함)

			if (!q.isEmpty() && q.peek() < date) { // 만약 이전 작업이 더 오래 걸리는 경우(즉, 현재 작업이 먼저 끝나는 경우)
				answerList.add(q.size()); // 큐의 사이즈를 결과 리스트에 추가 (배포된 작업의 수)
				q.clear(); // 큐 초기화
			}

			q.offer(date); // 큐에 현재 작업의 완료 날짜 추가
		}

		answerList.add(q.size()); // 마지막 배포 작업의 수 추가

		// 리스트를 배열로 변환
		int[] answer = new int[answerList.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = answerList.get(i); // 리스트의 각 원소를 배열에 추가
		}

		return answer; // 결과 반환
	}
}