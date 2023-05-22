package LV2;

import java.util.Arrays;

public class H42747 {
	public int solution(int[] citations) {
		Arrays.sort(citations);  // 인용 횟수를 오름차순으로 정렬

		int max = 0;  // H-Index를 저장할 변수를 초기화
		for (int i = 0; i < citations.length; i++) {  // 각 인용 횟수에 대해 반복
			// 현재 인용 횟수와 남은 논문 수 중 작은 값이 H-Index의 후보가 된다.
			int min = Math.min(citations[i], citations.length - i);
			if (max < min) max = min;  // 후보가 현재 H-Index보다 크면 값을 갱신
		}

		return max;  // 계산된 H-Index를 반환
	}
}
