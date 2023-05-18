package LV2;
/*
2차원 행렬 arr1과 arr2를 입력받아, arr1에 arr2를 곱한 결과를 반환하는 함수, solution을 완성해주세요.
 */
public class H12949 {
	// 함수의 입력값으로 두 2차원 배열 arr1, arr2를 받습니다.
	public int[][] solution(int[][] arr1, int[][] arr2) {
		// 결과를 저장할 answer 2차원 배열을 초기화, arr1의 행의 크기와 arr2의 열의 크기로 배열을 생성
		int[][] answer = new int[arr1.length][arr2[0].length];

		// arr1의 행을 순회하는 for문
		for (int i = 0; i < arr1.length; i++) {
			// arr2의 열을 순회하는 for문
			for (int j = 0; j < arr2[0].length; j++) {
				// arr1의 열 혹은 arr2의 행을 순회하는 for문
				// arr1의 각 행과 arr2의 각 열을 곱셈하는 과정을 수행
				for (int k = 0; k < arr1[0].length; k++) {
					// arr1의 i번째 행과 k번째 열의 원소와 arr2의 k번째 행과 j번째 열의 원소를 곱한 값을 answer의 i행 j열에 더함
					answer[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		// 최종적으로 계산된 행렬 곱 결과를 반환
		return answer;
	}
}
