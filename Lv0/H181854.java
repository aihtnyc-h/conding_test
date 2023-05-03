package Lv0;

public class H181854 {
	public int[] solution(int[] arr, int n) {
		int[] answer = new int[arr.length];

		if (arr.length % 2 == 1) {
			for (int i = 0; i < arr.length; i++) {
				if (i % 2 == 0) {
					answer[i] = arr[i] + n;
				} else {
					answer[i] = arr[i];
				}
			}
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (i % 2 == 1) {
					answer[i] = arr[i] + n;
				} else {
					answer[i] = arr[i];
				}
			}
		}

		return answer;
	}
}
