package LV1;

public class H161989 {
	public int solution(int n, int m, int[] section) {
		int answer = 0; // 칠하는 횟수를 저장할 변수
		int start = section[0]; // 롤러로 칠하기 시작할 첫 번째 위치
		int end = start + m - 1; // 롤러로 한 번에 칠할 수 있는 마지막 위치

		// section 배열을 순회하며 롤러로 칠할 수 있는 범위를 확인
		for (int i = 1; i < section.length; i++) {
			// 현재 구역(section[i])이 롤러로 칠할 수 있는 범위(end)를 넘는 경우
			if (section[i] > end) {
				answer++; // 칠하는 횟수를 증가
				start = section[i]; // 새로운 시작 위치를 현재 구역으로 설정
				end = start + m - 1; // 롤러로 칠할 수 있는 새로운 범위를 계산
			}
		}

		answer++; // 모든 구역을 확인한 후, 마지막 범위를 칠하므로 횟수를 추가로 1 증가

		return answer; // 최소 칠하는 횟수를 반환
	}
}
