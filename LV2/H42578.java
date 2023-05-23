package LV2;

import java.util.HashMap;
import java.util.Map;

public class H42578 {
	public static void main(String[] args) {
		// 테스트 케이스 정의
		String[][] clothes1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

		// 테스트 케이스 실행 및 결과 출력
		System.out.println(solution(clothes1)); // 출력: 5
		System.out.println(solution(clothes2)); // 출력: 3
	}

	public static int solution(String[][] clothes) {
		// HashMap 객체 생성 (의상의 종류를 키로, 해당 종류의 의상 개수를 값으로 저장)
		Map<String, Integer> clothesMap = new HashMap<>();

		// clothes 배열을 순회하면서 의상의 종류별 개수를 HashMap에 저장
		for (String[] cloth : clothes) {
			clothesMap.put(cloth[1], clothesMap.getOrDefault(cloth[1], 0) + 1);
		}

		// 모든 경우의 수를 저장할 변수 초기화 (1로 초기화하는 이유는 아래 곱셈 연산 때문)
		int answer = 1;

		// HashMap을 순회하면서 각 종류별 경우의 수를 모두 곱함
		for (int val : clothesMap.values()) {
			answer *= (val + 1); // 해당 종류의 의상을 입지 않는 경우를 고려하여 +1을 함
		}

		// 옷을 하나도 입지 않는 경우를 제외하고 반환
		return answer - 1;
	}
}