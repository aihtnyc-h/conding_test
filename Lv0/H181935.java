package Lv0;
/*
양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 n이
짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
 */
public class H181935 {
	public int solution(int n) {
		int sum = 0; // 변수 초기화
		// n이 홀수인 경우
		if (n % 2 == 1) {
			// 1부터 n까지의 홀수를 차례대로 더하기
			for (int i = 1; i <= n; i += 2) {
				sum += i;
			}
		}
		// n이 짝수인 경우
		else {
			// 2부터 n까지의 짝수의 제곱을 차례대로 더하기
			for (int i = 2; i <= n; i += 2) {
				sum += i * i;
			}
		}
		// 최종 합계 반환
		return sum;
	}
}
