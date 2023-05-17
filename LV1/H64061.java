package LV1;

import java.util.Stack;

public class H64061 {
	public int solution(int[][] board, int[] moves) {
		Stack<Integer> basket = new Stack<>(); // 바구니를 스택으로 표현
		int answer = 0; // 터트린 인형의 수

		for (int move : moves) { // 크레인의 모든 움직임에 대해
			for (int j = 0; j < board.length; j++) { // 각 열을 탐색
				if (board[j][move - 1] != 0) { // 만약 인형이 있는 칸을 찾았다면
					if (basket.empty()) { // 바구니가 비어 있다면
						basket.push(board[j][move - 1]); // 인형을 바구니에 넣음
					} else { // 바구니가 비어 있지 않다면
						if (basket.peek() == board[j][move - 1]) { // 바구니의 맨 위 인형과 현재 뽑은 인형을 비교
							basket.pop(); // 같다면 바구니의 맨 위 인형을 제거
							answer += 2; // 터트린 인형의 수를 2 늘림
						} else {
							basket.push(board[j][move - 1]); // 다르다면 현재 뽑은 인형을 바구니에 넣음
						}
					}
					board[j][move - 1] = 0; // 현재 뽑은 인형이 있던 칸을 비움
					break; // 더 이상 현재 열을 탐색하지 않음
				}
			}
		}
		return answer; // 터트린 인형의 수를 반환
	}
}