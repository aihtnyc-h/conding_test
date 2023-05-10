package Lv0;
/*
이차원 정수 배열 arr이 매개변수로 주어집니다. arr의 행의 수가 더 많다면 열의 수가 행의 수와 같아지도록 각 행의 끝에 0을 추가하고,
열의 수가 더 많다면 행의 수가 열의 수와 같아지도록 각 열의 끝에 0을 추가한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
 */
public class H181830 {
	public int[][] solution(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		int[][] answer;

		if (rows > cols) {
			answer = new int[rows][rows];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					answer[i][j] = arr[i][j];
				}
			}
		} else if (cols > rows) {
			answer = new int[cols][cols];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					answer[i][j] = arr[i][j];
				}
			}
		} else {
			answer = arr;
		}
		return answer;
	}
}
/*
주어진 배열의 행과 열의 수를 확인합니다.
행이 열보다 많은 경우, 각 행의 끝에 0을 추가하여 열의 수를 행의 수와 같게 합니다.
열이 행보다 많은 경우, 각 열의 끝에 0을 추가하여 행의 수를 열의 수와 같게 합니다.


행이 더 많은 경우에는 행의 크기에 맞춰서 새로운 배열을 생성하고, 열이 더 많은 경우에는 열의 크기에 맞춰서 새로운 배열을 생성
그리고 기존 배열의 값들을 새로운 배열에 복사합니다. 행과 열의 크기가 같은 경우에는 기존의 배열을 그대로 반환
 */