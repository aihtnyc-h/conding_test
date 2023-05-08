package Lv0;
/*
정수 배열 arr이 매개변수로 주어집니다.
arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다.
arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution 함수를 작성해 주세요.
 */
public class H181857 {
	public int[] solution(int[] arr) {
		int n = arr.length;
		int targetLength = 1;

		while (targetLength < n) {
			targetLength *= 2;
		}

		if (targetLength == n) {
			return arr;
		} else {
			int[] answer = new int[targetLength];
			System.arraycopy(arr, 0, answer, 0, n);
			for (int i = n; i < targetLength; i++) {
				answer[i] = 0;
			}
			return answer;
		}
	}
}
