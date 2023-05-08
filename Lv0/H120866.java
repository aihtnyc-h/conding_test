package Lv0;
/*
다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.
 */
public class H120866 {
	public int solution(int[][] board) {
		int answer = board.length;
		int safeAreaCount = 0;

		for (int i = 0; i < answer; i++) {
			for (int j = 0; j < answer; j++) {
				if (board[i][j] == 0) {
					boolean isSafe = true;

					for (int dx = -1; dx <= 1; dx++) {
						for (int dy = -1; dy <= 1; dy++) {
							int newRow = i + dx;
							int newCol = j + dy;

							if (newRow >= 0 && newRow < answer && newCol >= 0 && newCol < answer) {
								if (board[newRow][newCol] == 1) {
									isSafe = false;
									break;
								}
							}
						}
						if (!isSafe) {
							break;
						}
					}

					if (isSafe) {
						safeAreaCount++;
					}
				}
			}
		}

		return safeAreaCount;
	}
}