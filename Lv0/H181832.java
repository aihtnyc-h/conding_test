package Lv0;
/*
양의 정수 n이 매개변수로 주어집니다.
 n × n 배열에 1부터 n2 까지 정수를 인덱스 [0][0]부터 시계방향 나선형으로 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
 */
public class H181832 {
	public int[][] solution(int n) {
		int[][] answer = new int[n][n];
		int number = 1;
		int x = 0, y = -1;
		int direction = 1;

		while (n > 0) {
			for (int i = 0; i < n; i++) {
				y += direction;
				answer[x][y] = number++;
			}
			n--;

			for (int i = 0; i < n; i++) {
				x += direction;
				answer[x][y] = number++;
			}
			direction *= -1;
		}
		return answer;
	}
}
