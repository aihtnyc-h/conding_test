package Lv0;
/*
정수 배열 arr가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.

단, arr에 2가 없는 경우 [-1]을 return 합니다.
 */
public class H181894 {
	public int[] solution(int[] arr) {
		int n = arr.length;
		int first = -1, last = -1;

		for (int i = 0; i < n; i++) {
			if (arr[i] == 2) {
				if (first == -1) {
					first = i;
				}
				last = i;
			}
		}
		if (first == -1) {
			return new int[] {-1};
		} else {
			int[] answer = new int[last - first + 1];
			for (int i = 0; i < answer.length; i++) {
				answer[i] = arr[first + i];
			}
			return answer;

		}
	}
}
