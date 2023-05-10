package Lv0;
/*
2차원 정수 배열 `board`와 정수 `k`가 주어집니다.

`i` + `j` <= `k`를 만족하는 모든 (`i`, `j`)에 대한 `board[i][j]`의 합을 return 하는 solution 함수를 완성해 주세요.
 */
public class H181829 {
	public int solution(int[][] board, int k) {
		int answer = 0;

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (i + j <= k) {
					answer += board[i][j];
				}
			}
		}
		return answer;
	}
}
/*
2차원 배열에서 각 원소의 인덱스 i와 j의 합이 k이하인 경우에만 해당 원소의 값을 합산하여 반환하기
 */