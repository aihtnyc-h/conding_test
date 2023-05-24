package LV2;

public class H12985 {
	public int solution(int n, int a, int b) {
		// 라운드 수를 나타내는 변수를 초기화합니다.
		int round = 0;

		// a와 b가 같아질 때까지 반복합니다.
		while(a != b) {
			// 다음 라운드에서 a의 번호를 갱신합니다. 홀수일 경우 1을 더한 후 2로 나눠줍니다.
			a = (a + 1) / 2;

			// 다음 라운드에서 b의 번호를 갱신합니다. 홀수일 경우 1을 더한 후 2로 나눠줍니다.
			b = (b + 1) / 2;

			// 라운드 수를 증가시킵니다.
			round++;
		}

		// 마지막으로, 라운드 수를 반환합니다.
		return round;
	}
}
