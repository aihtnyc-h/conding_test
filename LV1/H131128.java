package LV1;
/*
두 정수 X, Y의 임의의 자리에서 공통으로 나타나는 정수 k(0 ≤ k ≤ 9)들을 이용하여 만들 수 있는 가장 큰 정수를 두 수의 짝꿍이라 합니다(단, 공통으로 나타나는 정수 중 서로 짝지을 수 있는 숫자만 사용합니다). X, Y의 짝꿍이 존재하지 않으면, 짝꿍은 -1입니다. X, Y의 짝꿍이 0으로만 구성되어 있다면, 짝꿍은 0입니다.

예를 들어, X = 3403이고 Y = 13203이라면, X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 3, 0, 3으로 만들 수 있는 가장 큰 정수인 330입니다. 다른 예시로 X = 5525이고 Y = 1255이면 X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 2, 5, 5로 만들 수 있는 가장 큰 정수인 552입니다(X에는 5가 3개, Y에는 5가 2개 나타나므로 남는 5 한 개는 짝 지을 수 없습니다.)
두 정수 X, Y가 주어졌을 때, X, Y의 짝꿍을 return하는 solution 함수를 완성해주세요.
 */
public class H131128 {
	public String solution(String X, String Y) {
		// 빈도 배열 초기화
		int[] freqX = new int[10];
		int[] freqY = new int[10];

		// X와 Y의 각 자릿수의 빈도를 센다
		for (char c : X.toCharArray()) freqX[c - '0']++;
		for (char c : Y.toCharArray()) freqY[c - '0']++;

		// 숫자 짝꿍을 생성한다
		StringBuilder sb = new StringBuilder();
		for (int i = 9; i >= 0; i--) {
			int common = Math.min(freqX[i], freqY[i]);
			for (int j = 0; j < common; j++) {
				sb.append(i);
			}
		}

		String result = sb.toString();

		// 짝꿍이 없거나 모두 0인 경우를 확인한다
		if (result.isEmpty()) {
			return "-1";
		} else if (result.replaceAll("0", "").isEmpty()) {
			return "0";
		} else {
			return result;
		}
	}
}