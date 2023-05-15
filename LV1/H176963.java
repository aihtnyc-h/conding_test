package LV1;

import java.util.HashMap;
import java.util.Map;

public class H176963 {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		// 사람 이름에 대응하는 그리움 점수를 저장하는 맵을 생성합니다.
		Map<String, Integer> nameToYearning = new HashMap<>();
		for (int i = 0; i < name.length; i++) {
			nameToYearning.put(name[i], yearning[i]);
		}

		// 각 사진의 추억 점수를 계산합니다.
		int[] answer = new int[photo.length];
		for (int i = 0; i < photo.length; i++) {
			int score = 0;
			for (String person : photo[i]) {
				// 해당 사람의 그리움 점수를 추억 점수에 더합니다.
				score += nameToYearning.getOrDefault(person, 0);
			}
			answer[i] = score;
		}

		return answer;
	}
}