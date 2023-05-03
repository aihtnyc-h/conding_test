package Lv0;
/*
정수 배열 `arr`와 자연수 `k`가 주어집니다.

만약 `k`가 홀수라면 `arr`의 모든 원소에 `k`를 곱하고, `k`가 짝수라면 `arr`의 모든 원소에 `k`를 더합니다.

이러한 변환을 마친 후의 `arr`를 return 하는 solution 함수를 완성해 주세요.
 */
public class H181835 {
	public int[] solution(int[] arr, int k) {
		int[] answer = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (k % 2 == 1) {
				answer[i] = arr[i] * k;
			} else {
				answer[i] = arr[i] + k;
			}
		}

		return answer;
	}
}
