package LV2;

public class H12945 {
	public int solution(int n) {
		int answer = 0;  // 결과를 저장할 변수를 선언, 초기값은 0으로 설정

		long[] pib = new long[n + 1];  // 피보나치 수열의 각 항을 저장할 배열을 선언
		// long 자료형으로 선언한 이유는 피보나치 수열의 값이 int 범위를 초과할 수 있기 때문

		pib[0] = 0L;  // 피보나치 수열의 0번째 항을 설정
		pib[1] = 1L;  // 피보나치 수열의 1번째 항을 설정

		for (int i = 2; i <= n; i++) {  // 2부터 n까지 반복
			pib[i] = (pib[i - 1] + pib[i - 2]) % 1234567L;  // 피보나치 수열의 정의에 따라 i번째 항을 (i-1번째 항 + i-2번째 항)으로 설정하고, 이를 1234567로 나눈 나머지를 저장
		}

		answer = (int) pib[n];  // 계산된 n번째 피보나치 수를 answer에 저장

		return answer;  // 계산 결과를 반환
	}
}
