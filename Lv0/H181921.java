package Lv0;

import java.util.ArrayList;
import java.util.List;

/*
정수 `l`과 `r`이 주어졌을 때, `l` 이상 `r`이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
 */
public class H181921 {
	public boolean isValid(int n) {
		while (n > 0) {
			int digit = n % 10;
			if (digit != 0 && digit != 5) {
				return false;
			}
			n /= 10;
		}
		return true;
	}

	public int[] solution(int l, int r) {
		List<Integer> resultList = new ArrayList<>();

		for (int i = l; i <= r; i++) {
			if (isValid(i)) {
				resultList.add(i);
			}
		}

		if (resultList.isEmpty()) {
			return new int[]{-1};
		}

		int[] answer = new int[resultList.size()];
		for (int i = 0; i < resultList.size(); i++) {
			answer[i] = resultList.get(i);
		}

		return answer;
	}
}
