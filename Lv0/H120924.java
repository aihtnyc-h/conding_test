package Lv0;
/*
등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
 */
public class H120924 {
	public int solution(int[] common) {
		int answer = 0;
		int n = common.length;

		// 등차수열인지 확인
		boolean isArithmetic = true;
		int diff = common[1] - common[0];
		for (int i = 2; i < n; i++) {
			if (common[i] - common[i - 1] != diff) {
				isArithmetic = false;
				break;
			}
		}

		if (isArithmetic) {
			answer = common[n - 1] + diff;
		} else {
			// 등비수열인 경우
			int ratio = common[1] / common[0];
			answer = common[n - 1] * ratio;
		}

		return answer;
	}
}
