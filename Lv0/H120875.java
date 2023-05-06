package Lv0;
/*
점 네 개의 좌표를 담은 이차원 배열  `dots`가 다음과 같이 매개변수로 주어집니다.

- [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]

주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해보세요.
 */
public class H120875 {
	public int solution(int[][] dots) {
		int answer = 0;

		double[] slopes = new double[3];
		slopes[0] = (double) (dots[1][1] - dots[0][1]) / (dots[1][0] - dots[0][0]) - (double) (dots[3][1] - dots[2][1]) / (dots[3][0] - dots[2][0]);
		slopes[1] = (double) (dots[2][1] - dots[0][1]) / (dots[2][0] - dots[0][0]) - (double) (dots[3][1] - dots[1][1]) / (dots[3][0] - dots[1][0]);
		slopes[2] = (double) (dots[2][1] - dots[1][1]) / (dots[2][0] - dots[1][0]) - (double) (dots[3][1] - dots[0][1]) / (dots[3][0] - dots[0][0]);

		for (double slope : slopes) {
			if (Math.abs(slope) < 1e-9) {
				answer = 1;
				break;
			}
		}

		return answer;
	}
}

